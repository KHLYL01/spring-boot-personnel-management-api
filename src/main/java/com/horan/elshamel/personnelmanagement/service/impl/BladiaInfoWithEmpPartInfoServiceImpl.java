package com.horan.elshamel.personnelmanagement.service.impl;

import com.horan.elshamel.personnelmanagement.model.dto.response.BladiaInfoWithEmpPartInfoResponseDto;
import com.horan.elshamel.personnelmanagement.repo.BladiaInfoRepo;
import com.horan.elshamel.personnelmanagement.repo.EmpPartInfoRepo;
import com.horan.elshamel.personnelmanagement.service.BladiaInfoWithEmpPartInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BladiaInfoWithEmpPartInfoServiceImpl implements BladiaInfoWithEmpPartInfoService {

    private final BladiaInfoRepo bladiaInfoRepo;
    private final EmpPartInfoRepo empPartInfoRepo;

    @Override
    public BladiaInfoWithEmpPartInfoResponseDto findAll() {
        return BladiaInfoWithEmpPartInfoResponseDto.builder()
                .bladiaInfo(bladiaInfoRepo.findAll().get(0))
                .empPartInfo(empPartInfoRepo.findAll().get(0))
                .build();
    }

    @Override
    public void save(BladiaInfoWithEmpPartInfoResponseDto dto) {
        bladiaInfoRepo.save(dto.getBladiaInfo());
        empPartInfoRepo.save(dto.getEmpPartInfo());
    }
}
