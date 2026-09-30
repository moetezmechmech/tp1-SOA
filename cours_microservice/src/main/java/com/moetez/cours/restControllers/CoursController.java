package com.moetez.cours.restControllers;

import com.moetez.cours.dto.CoursDto;
import com.moetez.cours.service.CoursService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cours")
@AllArgsConstructor
public class CoursController {

    private CoursService coursService;

    @GetMapping("{code}")
    public ResponseEntity<CoursDto> getCoursByCode(@PathVariable("code") String code) {
        return new ResponseEntity<>(coursService.getCoursByCode(code), HttpStatus.OK);
    }
}