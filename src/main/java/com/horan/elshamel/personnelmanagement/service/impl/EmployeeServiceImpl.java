package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmployeeFindDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmployeeReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmployeeSearchDto;
import com.horan.elshamel.personnelmanagement.model.dto.mosaeer.GzaSummaryDto;
import com.horan.elshamel.personnelmanagement.model.dto.mosaeer.HolidayEmployeeDto;
import com.horan.elshamel.personnelmanagement.model.dto.mosaeer.MosaeerSalaryDto;
import com.horan.elshamel.personnelmanagement.model.entity.Employee;
import com.horan.elshamel.personnelmanagement.repo.EmployeeRepo;
import com.horan.elshamel.personnelmanagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl extends BaseServiceImpl<Employee, Long> implements EmployeeService {

    private final EmployeeRepo repo;

    @Override
    public List<Employee> findAll() {
        return repo.findAll(PageRequest.of(0, 10, Sort.by("Id"))).getContent();
//        return repo.findAll();
    }

    public byte[] downloadImage(Long id) {
        Employee employee = findById(id);
        return employee.getPicEmp();
    }


    @Override
    public List<EmployeeSearchDto> searchEmployee(Long id, String name, String cardId, Long jobId, Long partId, String fia, BigDecimal draga, String jobState, String empType) {
        return repo.searchEmployee(id, name, cardId, jobId, partId, fia, draga, jobState, empType);
    }

    @Override
    public List<EmployeeReportDto> reportEmployee(Long partId, String jobState, String empType) {

        if(empType.equals("موظف") || empType.equals("مستخدم")){
            return repo.reportEmployee(partId,jobState,empType);
        }
        return repo.reportEmployee(null, jobState, empType);
    }

    @Override
    public List<EmployeeFindDto> findEmployee(Long id, String name, String cardId, String empType) {
        return repo.findEmployee(id, name, cardId, empType);
    }

    @Override
    public List<MosaeerSalaryDto> getMosaeerSalary(String empType, Date startDate, Date endDate) {
        List<MosaeerSalaryDto> mosaeerSalaryDtos = new ArrayList<>();

        if ("".equals(empType)) {
            mosaeerSalaryDtos = repo.getFullReport();
        } else if ("موظف | مستخدم".equals(empType)) {
            mosaeerSalaryDtos = repo.getUserAndEmployeeReport();
        } else if ("موظف | مستخدم | عامل بند إجور".equals(empType)) {
            mosaeerSalaryDtos = repo.getUserAndEmployeeAndWorkerBandOjorReport();
        } else if ("عامل بند إجور | عامل بند إجور غير سعودى".equals(empType)) {

            mosaeerSalaryDtos = repo.getWorkerBandOjorOrNonSaudiReport();
        } else {
            mosaeerSalaryDtos = repo.getByEmpTypeReport(empType);

        }

        for (MosaeerSalaryDto dto : mosaeerSalaryDtos) {
            List<HolidayEmployeeDto> holidays = repo.findHolidaysByEmpIdAndDateRange(dto.getId(), startDate, endDate);

            if (!holidays.isEmpty()){
                if(holidays.get(0).getQrarId()!=null && !holidays.get(0).getQrarId().isEmpty()) {
                    dto.setHolidays("1");
                } else {
                    dto.setHolidays("0");
                }
            }else{
                dto.setHolidays("0");

            }

            GzaSummaryDto gzaDto = repo.getGzaSummaryForEmployeeAndDateRange(dto.getId(), startDate, endDate);
            BigDecimal mokhafaGza = repo.getMokhafaGzaTotalByEmpAndDateRange(dto.getId(), startDate, endDate);
            if (mokhafaGza == null) {
                mokhafaGza = BigDecimal.ZERO;
            }

            // نحسب الجزاء
//            BigDecimal gaza = calculateGza(gzaDto.getGhyab(), gzaDto.getTagmee3(), gzaDto.getMosta7qTotal(), mokhafaGza);

            dto.setComments(buildComment(gzaDto.getGhyab(),                 // الغياب
                    gzaDto.getGza().add(mokhafaGza),   // مجموع الجزاءات
                    gzaDto.getTagmee3()                // التأخير
            ));

            BigDecimal gzaWithoutGhyab = calculateGzaWithoutGhyab(mokhafaGza, gzaDto.getGza(),       // مجموع GZA من جدول EMP_HASM_DET
                    gzaDto.getTagmee3(), dto.getSalary()        // أو dataRow.get("salary") حسب المصدر
            );

            // الجزاء
            dto.setGza(gzaWithoutGhyab);

            // مستحق الراتب
            dto.setMosta7qSalary(calculateMosta7q(dto.getSalary(), // الراتب
                    gzaDto.getGhyab() // الغياب
            ));

            // مستحق بدل العمل الطبيعي
            dto.setJobBadalat(calculateMosta7q(dto.getJobBadalat(), // بدل العمل الطبيعي
                    gzaDto.getGhyab() // الغياب
            ));

            // حساب التقاعد
            if ("عامل بند إجور".equals(empType)) {
                dto.setTaka3ed(getWith9in100(dto.getSalary()));
            } else if (!"عامل بند إجور غير سعودى".equals(empType)) {
                dto.setTaka3ed(getWith9in100(dto.getMosta7qSalary()));
            }
            if ("عامل أجنبي".equals(empType) || "عامل نظافة - عقد".equals(empType)) {
                dto.setTaka3ed(BigDecimal.ZERO);
                dto.setZeraee(BigDecimal.ZERO);
            }

            // مستحق بدل النقل
            dto.setNaqlBadal(calculateMosta7qNaqlBadal(
                    dto.getNaqlBadal(), // بدل النقل
                    gzaDto.getGhyab(), // الغياب
                    gzaDto.getGza()) // الجزاء
            );

            // حساب المعيشة
            if ("عامل أجنبي".equals(empType) || "عامل نظافة - عقد".equals(empType) || "عامل بند إجور غير سعودى".equals(empType)) {
                if (dto.getMaeesha() != null && dto.getMaeesha().intValue() == 1) {

                    BigDecimal maesha = dto.getSalary()
                            .multiply(dto.getMaeesha())
                            .divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP)
                            .setScale(2, RoundingMode.HALF_UP);

                    dto.setMa3esha(maesha);
                    dto.setSafyMa3esha(maesha);
                    dto.setInMa3esha(maesha);
                } else {
                    dto.setMa3esha(BigDecimal.ZERO);
                    dto.setSafyMa3esha(BigDecimal.ZERO);
                    dto.setInMa3esha(BigDecimal.ZERO);
                }
            }

            dto.setSalary(dto.getSalary().setScale(2, RoundingMode.HALF_UP));
            dto.setMosta7qSalary(dto.getMosta7qSalary().setScale(2, RoundingMode.HALF_UP));
            dto.setNaqlBadal(dto.getNaqlBadal().setScale(2, RoundingMode.HALF_UP));
            dto.setJobBadalat(dto.getJobBadalat().setScale(2, RoundingMode.HALF_UP));
            dto.setMosta7qTotal(dto.getMosta7qTotal().setScale(2, RoundingMode.HALF_UP));
            dto.setTaka3ed(dto.getTaka3ed().setScale(2, RoundingMode.HALF_UP));
            dto.setZeraee(dto.getZeraee().setScale(2, RoundingMode.HALF_UP));
            dto.setTaka3odM(dto.getTaka3odM().setScale(2, RoundingMode.HALF_UP));
            dto.setGza(dto.getGza().setScale(2, RoundingMode.HALF_UP));
            dto.setBank(dto.getBank().setScale(2, RoundingMode.HALF_UP));
            dto.setSandok(dto.getSandok().setScale(2, RoundingMode.HALF_UP));
            dto.setHasmTotal(dto.getHasmTotal().setScale(2, RoundingMode.HALF_UP));
            dto.setSafy(dto.getSafy().setScale(2, RoundingMode.HALF_UP));
            dto.setInMosta7qSalary(dto.getInMosta7qSalary().setScale(2, RoundingMode.HALF_UP));
            dto.setInMosta7qTotal(dto.getInMosta7qTotal().setScale(2, RoundingMode.HALF_UP));
            dto.setInSafy(dto.getInSafy().setScale(2, RoundingMode.HALF_UP));
            dto.setInNaqlBadal(dto.getInNaqlBadal().setScale(2, RoundingMode.HALF_UP));

            // مجموع المستحقات
            double badal2 = 0, badal3 = 0, badal4 = 0;
            if (dto.getBadal2() != null) {
                badal2 = dto.getBadal2() * 1.0;
            }
            if (dto.getBadal3() != null) {
                badal3 = dto.getBadal3() * 1.0;
            }
            if (dto.getBadal4() != null) {
                badal4 = dto.getBadal4() * 1.0;
            }

            dto.setMosta7qTotal(dto.getMosta7qSalary()
                    .add(dto.getJobBadalat())
                    .add(dto.getNaqlBadal())
                    .add(dto.getMa3esha())
                    .add(BigDecimal.valueOf(badal2))
                    .add(BigDecimal.valueOf(badal3))
                    .add(BigDecimal.valueOf(badal4))
                    .setScale(2, RoundingMode.HALF_UP)
            );

            // محموع الحسميات
            double hasm1 = 0, hasm2 = 0, hasm3 = 0;
            if (dto.getHasm1() != null) {
                hasm1 = dto.getHasm1() * 1.0;
            }
            if (dto.getHasm2() != null) {
                hasm2 = dto.getHasm2() * 1.0;
            }

            if (dto.getIsHasm3() != null) {
                if (dto.getIsHasm3() == 1) {
                    dto.setHasm3(dto.getSalary().divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP));
                    hasm3 = dto.getHasm3().doubleValue();
                }
            }
            dto.setHasmTotal(dto.getTaka3ed()
                    .add(dto.getGza())
                    .add(dto.getBank())
                    .add(dto.getSandok())
                    .add(dto.getZeraee())
                    .add(dto.getTaka3odM())
                    .add(BigDecimal.valueOf(hasm1))
                    .add(BigDecimal.valueOf(hasm2))
                    .add(BigDecimal.valueOf(hasm3))
                    .setScale(2, RoundingMode.HALF_UP)
            );

            dto.setSafy(dto.getMosta7qTotal()
                    .subtract(dto.getHasmTotal())
                    .setScale(2, RoundingMode.HALF_UP));
        }

        // remove if (عامل أجنبي or عامل نظافة - عقد) and (holdeday == 1)
        mosaeerSalaryDtos.removeIf(dto -> dto.getHolidays().equals("1") && ("عامل أجنبي".equals(empType) || "عامل نظافة - عقد".equals(empType)));


        return mosaeerSalaryDtos;
    }

    private BigDecimal calculateGza(BigDecimal ghyab, BigDecimal tagmee3, Long mosta7qTotal, BigDecimal mokhafaGza) {
        if (ghyab == null) ghyab = BigDecimal.ZERO;
        if (tagmee3 == null) tagmee3 = BigDecimal.ZERO;
        if (mokhafaGza == null) mokhafaGza = BigDecimal.ZERO;
        BigDecimal mosta7qTotal1 = new BigDecimal(mosta7qTotal);

        BigDecimal thirty = new BigDecimal("30");
        BigDecimal oneFiftyFive = new BigDecimal("155");

        // (ghyab + mokhafaGza + (mosta7qTotal / 30))
        BigDecimal part1 = ghyab.add(mokhafaGza).add(mosta7qTotal1.divide(thirty, 10, RoundingMode.HALF_UP));

        // * ghyab
        BigDecimal result1 = part1.multiply(ghyab);

        // (mosta7qTotal / 155) * tagmee3
        BigDecimal result2 = mosta7qTotal1.divide(oneFiftyFive, 10, RoundingMode.HALF_UP).multiply(tagmee3);

        // Final result with rounding
        return result1.add(result2).setScale(2, RoundingMode.HALF_UP);
    }

    private String buildComment(BigDecimal ghyab, BigDecimal gzaa, BigDecimal takher) {

        StringBuilder comment = new StringBuilder();
        boolean hasPrevious = false;

        if (ghyab != null && ghyab.compareTo(BigDecimal.ZERO) != 0) {
            comment.append(ghyab.stripTrailingZeros().toPlainString()).append(" غ");
            hasPrevious = true;
        }

        if (gzaa != null && gzaa.compareTo(BigDecimal.ZERO) != 0) {
            if (hasPrevious) comment.append(" و ");
            comment.append(gzaa.stripTrailingZeros().toPlainString()).append(" جزاء");
            hasPrevious = true;
        }

        if (takher != null && takher.compareTo(BigDecimal.ZERO) != 0) {
            if (hasPrevious) comment.append(" و ");
            comment.append(takher.stripTrailingZeros().toPlainString()).append(" ساعة");
        }

        return comment.toString();
    }

    private BigDecimal calculateGzaWithoutGhyab(BigDecimal mokhafaGza, BigDecimal gza, BigDecimal tagmee3, BigDecimal salary) {
        if (mokhafaGza == null) mokhafaGza = BigDecimal.ZERO;
        if (gza == null) gza = BigDecimal.ZERO;
        if (tagmee3 == null) tagmee3 = BigDecimal.ZERO;
        if (salary == null) salary = BigDecimal.ZERO;

        BigDecimal part1 = mokhafaGza.add(gza).divide(BigDecimal.valueOf(30), 10, RoundingMode.HALF_UP);
        BigDecimal part2 = tagmee3.divide(BigDecimal.valueOf(155), 10, RoundingMode.HALF_UP);

        BigDecimal result = part1.add(part2).multiply(salary);
        return result.setScale(2, RoundingMode.HALF_UP); // التقريب لرقمين بعد الفاصلة
    }

    private BigDecimal calculateMosta7q(BigDecimal money, BigDecimal ghyab) {
        if (money == null) money = BigDecimal.ZERO;
        if (ghyab == null) ghyab = BigDecimal.ZERO;

        BigDecimal dailyMoney = money.divide(BigDecimal.valueOf(30), 10, RoundingMode.HALF_UP);
        BigDecimal deduction = dailyMoney.multiply(ghyab);
        BigDecimal mosta7q = money.subtract(deduction);

        return mosta7q.setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal getWith9in100(BigDecimal number) {
        if (number == null) number = BigDecimal.ZERO;


        BigDecimal result = number
                .multiply(BigDecimal.valueOf(9))
                .divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP);

        return result.setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateMosta7qNaqlBadal(BigDecimal naqlBadal, BigDecimal ghyab, BigDecimal gza) {
        if (naqlBadal == null) naqlBadal = BigDecimal.ZERO;
        if (gza == null) gza = BigDecimal.ZERO;
        if (ghyab == null) ghyab = BigDecimal.ZERO;

        BigDecimal dailyNaqlBadal = naqlBadal.divide(BigDecimal.valueOf(30), 10, RoundingMode.HALF_UP);
        BigDecimal ghyabHasm = dailyNaqlBadal.multiply(ghyab);
        BigDecimal gzaHasm = dailyNaqlBadal.multiply(gza);
        BigDecimal totalHasm = ghyabHasm.add(gzaHasm);
        BigDecimal mosta7q = naqlBadal.subtract(totalHasm);

        return mosta7q.setScale(2, RoundingMode.HALF_UP);
    }




    //    public  byte[] decompressImage(byte[] data) {
//        Inflater inflater = new Inflater();
//        inflater.setInput(data);
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
//        byte[] tmp = new byte[4*1024];
//        try {
//            while (!inflater.finished()) {
//                int count = inflater.inflate(tmp);
//                outputStream.write(tmp, 0, count);
//            }
//            outputStream.close();
//        } catch (Exception ignored) {
//        }
//        return outputStream.toByteArray();
//    }

}
