package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidaysTamdeed;
import com.horan.elshamel.personnelmanagement.service.EmpHolidaysTamdeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-holidays-tamdeeds")
public class EmpHolidaysTamdeedController {

    private final EmpHolidaysTamdeedService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpHolidaysTamdeed> findAll() {
        return service.findAll();
    }

//    @GetMapping("/nextId")
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public Long getNextId() {
//        return service.getNextId();
//    }

    @GetMapping("/holiday/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpHolidaysTamdeed> findAllByHolidayId(@PathVariable Long id) {
        return service.findAllByHolidaysId(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpHolidaysTamdeed findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpHolidaysTamdeed save(@RequestBody  EmpHolidaysTamdeed dto) {
        return service.save(dto);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }

}
