package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.EmpMobashraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpEndEmp;
import com.horan.elshamel.personnelmanagement.model.entity.EmpMobashra;
import com.horan.elshamel.personnelmanagement.service.EmpMobashraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-mobashra")
public class EmpMobashraController {

    private final EmpMobashraService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpMobashra> findAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpMobashraSearchDto> searchMobashra(@RequestParam(required = false) String name,
                                                     @RequestParam(required = false) String cardId,
                                                     @RequestParam(required = false) String empType) {
        return service.searchMobashra(name, cardId, empType);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpMobashra findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpMobashra save(@RequestBody  EmpMobashra dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpMobashra update(@PathVariable Long id, @RequestBody  EmpMobashra dto) {
        return service.update(id,dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
