package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.entity.EmpNations;
import com.horan.elshamel.personnelmanagement.model.entity.EmpNations;
import com.horan.elshamel.personnelmanagement.model.entity.EmpParts;
import com.horan.elshamel.personnelmanagement.service.EmpNationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-nations")
public class EmpNationsController {

    private final EmpNationsService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpNations> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpNations findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/find")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpNations> findNations(
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "name", required = false) String name) {
        return service.findNations(id, name);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpNations save(@RequestBody EmpNations dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpNations update(@PathVariable Long id, @RequestBody EmpNations dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }

}
