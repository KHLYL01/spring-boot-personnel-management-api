package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.det.EmpMokhalfatDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpMokhalfatReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpMokhalfatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfat;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMokhalfatDet;
import com.horan.elshamel.personnelmanagement.service.EmpMokhalfatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-mokhalfats")
public class EmpMokhalfatController {

    private final EmpMokhalfatService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpMokhalfat> findAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpMokhalfatSearchDto> searchMokhalfat(@RequestParam(required = false) String name,
                                                   @RequestParam(required = false) String cardId) {
        return service.searchMokhalfat(name,cardId);
    }

    @GetMapping("/report")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpMokhalfatReportDto> reportMokhalfat(
            @RequestParam(required = false) boolean all,
            @RequestParam(required = false) Long empId,
            @RequestParam(required = false) Date fromDate,
            @RequestParam(required = false) Date toDate) {
        return service.reportMokhalfat(all, empId, fromDate, toDate);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpMokhalfat findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpMokhalfat save(@RequestBody  EmpMokhalfat dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }

    @GetMapping("/{id}/det")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpMokhalfatDetDto> getMokhalfatDetByMokhalfatId(@PathVariable Long id) {
        return service.getMokhalfatDetByMokhalfatId(id);
    }

    @GetMapping("/det/nextId")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Long getNextDetId() {
        return service.getNextDetId();
    }

    @PostMapping("/det")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpMokhalfatDet saveMokhalfatDet(@RequestBody EmpMokhalfatDet dto) {
        return service.saveMokhalfatDet(dto);
    }

    @DeleteMapping("/det/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void deleteMokhalfatDetById(@PathVariable long id) {
        service.deleteMokhalfatDetById(id);
    }

}
