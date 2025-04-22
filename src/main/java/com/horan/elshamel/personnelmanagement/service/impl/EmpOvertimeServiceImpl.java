package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmpOvertimeSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpOvertime;
import com.horan.elshamel.personnelmanagement.repo.EmpOvertimeRepo;
import com.horan.elshamel.personnelmanagement.service.EmpOvertimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpOvertimeServiceImpl extends BaseServiceImpl<EmpOvertime,Long> implements EmpOvertimeService {

    private final EmpOvertimeRepo repo;

    @Override
    public List<EmpOvertimeSearchDto> searchOvertime(String name, String cardId, String place) {
        return repo.searchOvertime(name,cardId,place);
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
