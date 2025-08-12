package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.entity.EmpJobs;
import com.horan.elshamel.personnelmanagement.model.entity.EmpParts;
import com.horan.elshamel.personnelmanagement.service.EmpPartsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-parts")
public class EmpPartsController {

    private final EmpPartsService service;


    @GetMapping("/find")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpParts> findParts(
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "name", required = false) String name) {
        return service.findParts(id, name);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpParts findById(@PathVariable Long id) {
        return service.findById(id);
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpParts> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpParts save(@RequestBody EmpParts dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
