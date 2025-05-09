package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.BladiaInfoWithEmpPartInfoDto;
import com.horan.elshamel.personnelmanagement.service.BladiaInfoWithEmpPartInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bladias")
@RequiredArgsConstructor
public class BladiaInfoWithEmpPartInfoController {

    private final BladiaInfoWithEmpPartInfoService service;

    @GetMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    final BladiaInfoWithEmpPartInfoDto findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    final void save(@RequestBody BladiaInfoWithEmpPartInfoDto dto) {
        service.save(dto);
    }

}
