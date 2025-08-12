//package com.horan.elshamel.personnelmanagement.controller;
//
//import com.horan.elshamel.personnelmanagement.model.dto.UserPassDto;
//import com.horan.elshamel.personnelmanagement.model.entity.EmpUsersPass;
//import com.horan.elshamel.personnelmanagement.service.EmpUsersPassService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/v1/users")
//public class EmpUsersPassController {
//
//    private final EmpUsersPassService service;
//
//    @GetMapping("/nextId")
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public BigDecimal getNextDetId() {
//        return service.getNextDetId();
//    }
//
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public List<UserPassDto> findAll() {
//        return service.findAllUsers();
//    }
//
//    @GetMapping("/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public List<EmpUsersPass> findAllById(@PathVariable BigDecimal id) {
//        return service.findAllById(id);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    @ResponseBody
//    public List<EmpUsersPass> saveAllForId(@RequestBody List<EmpUsersPass> list) {
//        return service.saveAllForId(list);
//    }
//
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @ResponseBody
//    public void delete(@PathVariable BigDecimal id) {
//        service.deleteAllById(id);
//    }
//
//}
