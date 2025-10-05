package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysSearchDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHolidaysTamdeedReportDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidays;
import com.horan.elshamel.personnelmanagement.repo.EmpHolidaysRepo;
import com.horan.elshamel.personnelmanagement.repo.EmpHolidaysTamdeedRepo;
import com.horan.elshamel.personnelmanagement.service.EmpHolidaysService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class EmpHolidaysServiceImpl extends BaseServiceImpl<EmpHolidays, Long> implements EmpHolidaysService {

    private final EmpHolidaysRepo repo;
    private final EmpHolidaysTamdeedRepo tamdeedRepo;

    @Override
    public List<EmpHolidaysSearchDto> searchHolidays(Long empId, String name, String cardId, String empType, Integer holidayType) {
        return repo.searchHolidays(empId, name, cardId, empType, holidayType);
    }

    @Override
    public List<EmpHolidaysReportDto> reportHolidays(boolean all, Long empId, Date fromDate, Date toDate, BigDecimal fromPeriod, BigDecimal toPeriod, Integer holidayType) {
        List<EmpHolidaysReportDto> reportDtos = repo.reportHolidays(all, empId, fromDate, toDate, fromPeriod, toPeriod, holidayType);
//        List<EmpHolidaysReportDto> reportDtos = repo.testWithoutDates(empId);

        System.out.println(reportDtos.size());

        List<EmpHolidaysReportDto> result = reportDtos.stream()
                .filter(e -> e.getTamdeedPeriod() != null && e.getTamdeedPeriod() > 0)
                .toList();

        System.out.println(result.size());

        reportDtos.addAll(result);

        for (EmpHolidaysReportDto reportDto : reportDtos) {
            EmpHolidaysTamdeedReportDto dto = tamdeedRepo.countPeriod(reportDto.getId()).get(0);
            if(dto != null && dto.getSumOfPeriod() > 0) {
                reportDto.setPeriod(reportDto.getPeriod().add(new BigDecimal(dto.getSumOfPeriod())));
                reportDto.setTamdeedEndDate(dto.getTamdeedEnd());
            }
            reportDto.setHolidayType(getType(reportDto.getHolidayTypeId()));
        }

        return reportDtos;
    }

    String getType(Integer holidayType) {
        if (holidayType == null) return "غير محدد";

        switch (holidayType) {
            case 0: return "إعتيادية سنوى";
            case 1: return "إضطرارية";
            case 2: return "إستثنائية";
            case 3: return "تعويض";
            case 4: return "مرضية";
            case 5: return "مرافق";
            case 6: return "اعتيادية مفرقة";
            case 7: return "امومة (وضع)";
            case 9: return "إعتيادى مرحل";
            case 10: return "إعتيادى قديم";
            case 11: return "إجازة الأبوة";
            case 12: return "إجازة الوفاة";
            case 13: return "إجازة الوضع";
            case 14: return "إجازة الامتحانات";
            case 15: return "الإجازة الخطيرة";
            case 16: return "وقوع الكارثة";
            default: return "نوع غير معروف";
        }
    }


//
//    @Override
//    public List<EmpHolidays> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpHolidays save( EmpHolidays dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpHolidays update(EmpHolidays dto) {
//        EmpHolidays empDegrees = findById(dto.getId());
//        empDegrees.setMartaba(dto.getMartaba());
//        empDegrees.setDraga(dto.getDraga());
//        empDegrees.setElawa(dto.getElawa());
//        empDegrees.setNaqlBadal(dto.getNaqlBadal());
//        empDegrees.setInEntedabBadal(dto.getInEntedabBadal());
//        empDegrees.setOutEntedabadal(dto.getOutEntedabadal());
//        empDegrees.setSalary(dto.getSalary());
//        empDegrees.setType(dto.getType());
//        repo.save(empDegrees);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpHolidays findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp jobs with id "+ id + " not found")
//        );
//    }
}
