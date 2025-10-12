package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.entity.Banks;
import com.horan.elshamel.personnelmanagement.service.BanksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/banks")
public class BanksController {

    private final BanksService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Banks> findAll() {
        return service.findAll();
    }

    @GetMapping("/find")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Banks> findBanks(@RequestParam(value = "id", required = false) String id, @RequestParam(value = "name", required = false) String name) {
        return service.findBanks(id, name);
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Banks findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Banks save(@RequestBody Banks dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }
}
