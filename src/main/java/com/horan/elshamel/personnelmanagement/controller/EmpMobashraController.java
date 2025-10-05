package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.query.EmpHasmiatReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpMobashraReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpMobashraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMobashra;
import com.horan.elshamel.personnelmanagement.service.EmpMobashraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-mobashra")
public class EmpMobashraController {

    private final EmpMobashraService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpMobashra> findAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpMobashraSearchDto> searchMobashra(@RequestParam(required = false) String name,
                                                     @RequestParam(required = false) String cardId,
                                                     @RequestParam(required = false) String empType) {
        return service.searchMobashra(name, cardId, empType);
    }

    @GetMapping("/report")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpMobashraReportDto> reportMobashra(
            @RequestParam(required = false) boolean all,
            @RequestParam(required = false) Long empId,
            @RequestParam(required = false) Date fromDate,
            @RequestParam(required = false) Date toDate) {
        return service.reportMobashra(all, empId, fromDate, toDate);
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpMobashra findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpMobashra save(@RequestBody  EmpMobashra dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
