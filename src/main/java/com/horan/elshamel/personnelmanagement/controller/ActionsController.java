package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.entity.Actions;
import com.horan.elshamel.personnelmanagement.service.ActionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/actions")
public class ActionsController {

    private final ActionsService service;

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public List<Actions> findAll() {
//        return service.findAll();
//    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Actions> searchEndEmp(
            @RequestParam(required = false) Long id,
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String action,
            @RequestParam(required = false) boolean all,
            @RequestParam(required = false) LocalDate fromDate,
            @RequestParam(required = false) LocalDate toDate
    ) {
        return service.search(id, username, type, action, all, fromDate, toDate);
    }

//    @GetMapping("/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public Actions findById(@PathVariable Long id) {
//        return service.findById(id);
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Actions save(@RequestBody Actions dto) {
        dto.setDat(LocalDate.now());
        dto.setTim(LocalTime.now());
        return service.save(dto);
    }

//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @ResponseBody
//    public void delete(@PathVariable long id) {
//        service.deleteById(id);
//    }
}
