package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.EmpDaoraSearchDto;
import com.horan.elshamel.personnelmanagement.model.entity.EmpDaora;
import com.horan.elshamel.personnelmanagement.service.EmpDaoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/emp-daoras")
public class EmpDaoraController {

    private final EmpDaoraService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmpDaora> findAll() {
        return service.findAll();
    }

//    @GetMapping("/search")
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public List<EmpDaoraSearchDto> entedabSearch(@RequestParam(required = false) String employeeName,
//                                                   @RequestParam(required = false) String cardId,
//                                                   @RequestParam(required = false) String entedabPlace) {
//        return service.entedabSearch(employeeName,cardId,entedabPlace);
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public EmpDaora save(@RequestBody  EmpDaora dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public EmpDaora update(@PathVariable Long id, @RequestBody  EmpDaora dto) {
        return service.update(id,dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }
}
