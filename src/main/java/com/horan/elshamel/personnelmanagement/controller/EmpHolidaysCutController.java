package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysCut;
import com.horan.elshamel.personnelmanagement.service.EmpHolidaysCutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-holidays-cuts")
public class EmpHolidaysCutController {

    private final EmpHolidaysCutService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpHolidaysCut> findAll() {
        return service.findAll();
    }
//
//    @GetMapping("/nextId")
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public Long getNextId() {
//        return service.getNextId();
//    }

    @GetMapping("/holiday/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpHolidaysCut> findAllByHolidayId(@PathVariable Long id) {
        return service.findAllByHolidaysId(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpHolidaysCut findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpHolidaysCut save(@RequestBody  EmpHolidaysCut dto) {
        return service.save(dto);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }

}
