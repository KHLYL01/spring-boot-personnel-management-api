package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.entity.EmpDowraBadalCountry;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDowraBadalCountry;
import com.horan.elshamel.personnelmanagement.service.EmpDowraBadalCountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-dowra-badal-countries")
public class EmpDowraBadalCountryController {

    private final EmpDowraBadalCountryService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpDowraBadalCountry> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpDowraBadalCountry save(@RequestBody  EmpDowraBadalCountry dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
