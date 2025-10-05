package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.det.EmpTakleefDetDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefReportDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmpTakleefSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTakleefDet;
import com.horan.elshamel.personnelmanagement.model.entity.EmpTakleef;
import com.horan.elshamel.personnelmanagement.repo.EmpTakleefRepo;
import com.horan.elshamel.personnelmanagement.service.EmpTakleefService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-takleefs")
public class EmpTakleefController {

    private final EmpTakleefService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpTakleef> findAll() {
        return service.findAll();
    }


    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpTakleefSearchDto> searchTakleef(@RequestParam(required = false) String name,
                                                   @RequestParam(required = false) String cardId,
                                                   @RequestParam(required = false) String place) {
        return service.searchTakleef(name,cardId,place);
    }

    @GetMapping("/report")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpTakleefReportDto> reportTakleef(
                                                   @RequestParam(required = false) boolean all,
                                                   @RequestParam(required = false) Long empId,
                                                   @RequestParam(required = false) Date fromDate,
                                                   @RequestParam(required = false) Date toDate) {
        return service.reportTakleef(all, empId, fromDate, toDate);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpTakleef findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpTakleef save(@RequestBody EmpTakleef dto) {
        return service.save(dto);
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
    public List<EmpTakleefDetDto> getTakleefDetByTakleefId(@PathVariable Long id) {
        return service.getTakleefDetByTakleefId(id);
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
    public EmpTakleefDet saveTakleefDet(@RequestBody EmpTakleefDet dto) {
        return service.saveTakleefDet(dto);
    }

    @DeleteMapping("/det/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void deleteTakleefDetById(@PathVariable long id) {
        service.deleteTakleefDetById(id);
    }

}
