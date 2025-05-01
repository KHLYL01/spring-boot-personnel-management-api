package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.EmpHasmiatDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.EmpHasmiatSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmDet;
import com.horan.elshamel.personnelmanagement.model.entity.EmpHasmiat;
import com.horan.elshamel.personnelmanagement.service.EmpHasmiatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-hasmiats")
public class EmpHasmiatController {

    private final EmpHasmiatService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpHasmiat> findAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpHasmiatSearchDto> searchHasmiat(@RequestParam(required = false) String name,
                                                   @RequestParam(required = false) String cardId) {
        return service.searchHasmiat(name, cardId);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpHasmiat findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpHasmiat save(@RequestBody  EmpHasmiat dto) {
        return service.save(dto);
    }



    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpHasmiat update(@PathVariable Long id, @RequestBody  EmpHasmiat dto) {
        return service.update(id,dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }

    @GetMapping("/{id}/det")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpHasmiatDetDto> getHasmiatDetByHasmiatId(@PathVariable Long id) {
        return service.getHasmiatDetByHasmiatId(id);
    }

    @GetMapping("/det/nextId")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Long getNextDetId() {
        return service.getNextDetId();
    }

    @PostMapping("/det")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpHasmDet saveHasmiatDet(@RequestBody EmpHasmDet dto) {
        return service.saveHasmiatDet(dto);
    }

    @DeleteMapping("/det/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void deleteHasmDetById(@PathVariable long id) {
        service.deleteHasmDetById(id);
    }
}
