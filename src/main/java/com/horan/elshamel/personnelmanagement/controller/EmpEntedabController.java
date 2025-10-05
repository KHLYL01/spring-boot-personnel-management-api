package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.query.EmpEntedabReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpEntedabSearchDto;
import com.horan.elshamel.personnelmanagement.model.dto.det.EmpEntedabDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefReportDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedab;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEntedabDet;
import com.horan.elshamel.personnelmanagement.service.EmpEntedabService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-entedabs")
public class EmpEntedabController {

    private final EmpEntedabService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpEntedab> findAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpEntedabSearchDto> entedabSearch(@RequestParam(required = false) String employeeName,
                                                   @RequestParam(required = false) String cardId,
                                                   @RequestParam(required = false) String entedabPlace) {
        return service.entedabSearch(employeeName,cardId,entedabPlace);
    }
    @GetMapping("/report")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpEntedabReportDto> entedabReport(
            @RequestParam(required = false) Long empId,
            @RequestParam(required = false) Date fromDate,
            @RequestParam(required = false) Date toDate) {
        return service.entedabReport(empId, fromDate, toDate);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpEntedab findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpEntedab save(@RequestBody  EmpEntedab dto) {
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
    public List<EmpEntedabDetDto> getEntedabDetByEntedabId(@PathVariable Long id) {
        return service.getEntedabDetByEntedabId(id);
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
    public EmpEntedabDet saveEntedabDet(@RequestBody EmpEntedabDet dto) {
        return service.saveEntedabDet(dto);
    }

    @DeleteMapping("/det/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void deleteEntedabDetById(@PathVariable long id) {
        service.deleteEntedabDetById(id);
    }

}
