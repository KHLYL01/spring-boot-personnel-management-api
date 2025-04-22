package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.entity.EmpJobs;
import com.horan.elshamel.personnelmanagement.model.entity.EmpJobs;
import com.horan.elshamel.personnelmanagement.model.entity.EmpParts;
import com.horan.elshamel.personnelmanagement.service.EmpJobsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-jobs")
public class EmpJobsController {

    private final EmpJobsService service;

    @GetMapping("/find")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpJobs> findJobs(
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "name", required = false) String name) {
        return service.findJobs(id, name);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpJobs> findAll() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpJobs save(@RequestBody  EmpJobs dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpJobs update(@PathVariable Long id, @RequestBody  EmpJobs dto) {
        return service.update(id,dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
