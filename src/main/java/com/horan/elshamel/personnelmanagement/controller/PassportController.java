package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.query.PassportSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.Passport;
import com.horan.elshamel.personnelmanagement.service.PassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/passports")
public class PassportController {

    private final PassportService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Passport> findAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<PassportSearchDto> searchPassport(@RequestParam(required = false) String name,
                                                 @RequestParam(required = false) String passportNumber) {
        return service.searchPassport(name, passportNumber);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Passport findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Passport save(@RequestBody  Passport dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
