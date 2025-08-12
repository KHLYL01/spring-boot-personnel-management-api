package com.horan.elshamel.personnelmanagement.controller;

import com.horan.elshamel.personnelmanagement.model.dto.request.UserSignatureRequestDto;
import com.horan.elshamel.personnelmanagement.model.dto.response.UserSignatureResponseDto;
import com.horan.elshamel.personnelmanagement.service.UserSignatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/signatures")
public class UserSignatureController {

    private final UserSignatureService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<UserSignatureResponseDto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}/image")
    public ResponseEntity<?> viewImage(@PathVariable Long id) {
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.IMAGE_PNG_VALUE)
                .body(service.viewImageById(id));
    }

    @GetMapping("/user/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<UserSignatureResponseDto> findAllByUserId(@PathVariable Long id) {
        return service.findAllByUserId(id);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public UserSignatureResponseDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public UserSignatureResponseDto save(
        @RequestParam("image") MultipartFile image,
        @RequestParam("content") String content,
        @RequestParam("password") String password,
        @RequestParam("userId") Long userId
    ) throws IOException {
        return service.save(UserSignatureRequestDto.builder()
                        .userId(userId)
                        .content(content)
                        .image(image)
                        .password(password)
                .build());
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

}
