package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.query.EmployeeFindDto;
import com.horan.elshamel.personnelmanagement.model.dto.query.EmployeeSearchDto;
import com.horan.elshamel.personnelmanagement.model.dto.mosaeer.MosaeerSalaryDto;
import com.horan.elshamel.personnelmanagement.model.entity.Employee;
import com.horan.elshamel.personnelmanagement.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Employee> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Employee findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/search")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmployeeSearchDto> searchEmployee(
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "cardId", required = false) String cardId,
            @RequestParam(value = "jobId", required = false) Long jobId,
            @RequestParam(value = "partId", required = false) Long partId,
            @RequestParam(value = "fia", required = false) String fia,
            @RequestParam(value = "draga", required = false) BigDecimal draga,
            @RequestParam(value = "jobState", required = false) String jobState,
            @RequestParam(value = "empType", required = false) String empType) {
        return service.searchEmployee(id, name, cardId, jobId, partId, fia, draga, jobState, empType);
    }

    @GetMapping("/find")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<EmployeeFindDto> findEmployee(
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "cardId", required = false) String cardId,
            @RequestParam(value = "empType", required = false) String empType) {
        return service.findEmployee(id, name, cardId,empType);
    }



//    @GetMapping("/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    @ResponseBody
//    public Employee findById(@PathVariable Long id) {
//        return service.findById(id);
//    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Employee save(@RequestBody Employee dto) {
        return service.save(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.deleteById(id);
    }


    @GetMapping("/{id}/image")
    public ResponseEntity<?> getImageByName(@PathVariable Long id) throws IOException {
        byte[] imageBytes = service.downloadImage(id);

        ByteArrayResource resource = new ByteArrayResource(imageBytes);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
        headers.setContentLength(imageBytes.length);
        headers.setContentDispositionFormData("inline", "employee_image.jpg"); // "inline" لعرض الصورة في المتصفح

        return ResponseEntity.ok()
                .headers(headers)
                .body(resource);
    }

    @GetMapping("/mosaeer-salary")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<MosaeerSalaryDto> mosaeerSalary(
            @RequestParam(value = "empType" ,required = false ,defaultValue = "") String empType,
            @RequestParam(value = "startDate",defaultValue = "2020-09-15") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
            @RequestParam(value = "endDate",defaultValue = "2025-09-15")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate
            ) {
        return service.getMosaeerSalary(empType,startDate,endDate);
    }
}
