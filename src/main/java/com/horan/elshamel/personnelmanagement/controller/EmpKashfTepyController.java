package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.query.EmpKashfTepySearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpKashfTepy;
import com.horan.elshamel.personnelmanagement.service.EmpKashfTepyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-kashf-tepy")
public class EmpKashfTepyController {

    private final EmpKashfTepyService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpKashfTepy> findAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpKashfTepySearchDto> searchKashfTepy(@RequestParam(required = false) String name,
                                                       @RequestParam(required = false) String cardId,
                                                       @RequestParam(required = false) String empType) {
        return service.searchKashfTepy(name, cardId, empType);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpKashfTepy findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpKashfTepy save(@RequestBody EmpKashfTepy dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
