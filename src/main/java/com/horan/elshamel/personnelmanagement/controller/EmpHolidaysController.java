package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.EmpHolidaysSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEndEmp;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHolidays;
import com.horan.elshamel.personnelmanagement.service.EmpHolidaysService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-holidays")
public class EmpHolidaysController {

    private final EmpHolidaysService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpHolidays> findAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpHolidaysSearchDto> searchHolidays(@RequestParam(required = false) Long empId,
                                                    @RequestParam(required = false) String name,
                                                    @RequestParam(required = false) String cardId,
                                                    @RequestParam(required = false) String empType,
                                                    @RequestParam(required = false) Integer holidayType) {
        return service.searchHolidays(empId, name, cardId, empType, holidayType);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpHolidays findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpHolidays save(@RequestBody  EmpHolidays dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpHolidays update(@PathVariable Long id, @RequestBody  EmpHolidays dto) {
        return service.update(id,dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
