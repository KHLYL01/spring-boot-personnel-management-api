package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.base.BaseServiceImpl;
import com.horan.elshamel.personnelmanagement.model.dto.EmpEntedabDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.EmpEntedabSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedab;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedabDet;
import com.horan.elshamel.personnelmanagement.repo.EmpEntedabDetRepo;
import com.horan.elshamel.personnelmanagement.repo.EmpEntedabRepo;
import com.horan.elshamel.personnelmanagement.service.EmpEntedabService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmpEntedabServiceImpl extends BaseServiceImpl<EmpEntedab,Long> implements EmpEntedabService {

    private final EmpEntedabRepo repo;
    private final EmpEntedabDetRepo repoDet;

    @Override
    public List<EmpEntedabSearchDto> entedabSearch(String employeeName, String cardId, String entedabPlace) {
        return repo.entedabSearch(employeeName,cardId,entedabPlace);
    }

    @Override
    public List<EmpEntedabDetDto> getEntedabDetByEntedabId(Long entedabId) {
        return repoDet.getEntedabDetByEntedabId(entedabId);
    }

    @Override
    public EmpEntedabDet saveEntedabDet(EmpEntedabDet empEntedabDet) {
        return repoDet.save(empEntedabDet);
    }

    @Override
    public void deleteEntedabDetById(Long id) {
        repoDet.deleteById(id);
    }

    @Override
    public Long getNextDetId() {
        return repoDet.getNextId();
    }

}
