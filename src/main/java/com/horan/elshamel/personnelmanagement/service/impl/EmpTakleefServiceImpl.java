package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpTakleefDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTakleef;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTakleefDet;
import com.horan.elshamel.personnelmanagement.repo.EmpTakleefDetRepo;
import com.horan.elshamel.personnelmanagement.repo.EmpTakleefRepo;
import com.horan.elshamel.personnelmanagement.service.EmpTakleefService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpTakleefServiceImpl extends BaseServiceImpl<EmpTakleef,Long> implements EmpTakleefService {

    private final EmpTakleefRepo repo;
    private final EmpTakleefDetRepo repoDet;

    @Override
    public List<EmpTakleefSearchDto> searchTakleef(String name, String cardId, String place) {
        return repo.searchOvertime(name,cardId,place);
    }

    @Override
    public List<EmpTakleefReportDto> reportTakleef(boolean all,Long empId, Date fromDate, Date toDate) {
        return repo.reportOvertime(all,empId, fromDate, toDate);
    }

    @Override
    public List<EmpTakleefDetDto> getTakleefDetByTakleefId(Long takleefId) {
        return repoDet.getTakleefDetByTakleefId(takleefId);
    }

    @Override
    public EmpTakleefDet saveTakleefDet(EmpTakleefDet empTakleefDet) {
        return repoDet.save(empTakleefDet);
    }

    @Override
    public void deleteTakleefDetById(Long id) {
        repoDet.deleteById(id);
    }

    @Override
    public Long getNextDetId() {
        return repoDet.getNextId();
    }

//    -private final EmpOvertimeRepo repo;
//
//    @Override
//    public List<EmpOvertime> findAll() {
//        return repo.findAll();
//    }
//
//    @Override
//    public EmpOvertime save( EmpOvertime dto) {
//        repo.save(dto);
//        return null;
//    }
//
//    @Override
//    public EmpOvertime update(EmpOvertime dto) {
//        EmpOvertime empOvertime = findById(dto.getId());
//        empOvertime.setName(dto.getName());
//        repo.save(empOvertime);
//        return null;
//    }
//
//    @Override
//    public void delete(long id) {
//        repo.delete(findById(id));
//    }
//
//    private EmpOvertime findById(long id){
//        return repo.findById(id).orElseThrow(
//                () -> new RuntimeException("Emp Overtime with id "+ id + " not found")
//        );
//    }
}
