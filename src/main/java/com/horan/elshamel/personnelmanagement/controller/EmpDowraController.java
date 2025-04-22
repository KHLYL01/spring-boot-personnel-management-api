package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.EmpDowraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDowra;
import com.horan.elshamel.personnelmanagement.service.EmpDowraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-dowras")
public class EmpDowraController {

    private final EmpDowraService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpDowra> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpDowra findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpDowraSearchDto> searchDowra(@RequestParam(required = false) String name,
                                               @RequestParam(required = false) String cardId) {
        return service.searchDowra(name, cardId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpDowra save(@RequestBody  EmpDowra dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpDowra update(@PathVariable Long id, @RequestBody  EmpDowra dto) {
        return service.update(id,dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
