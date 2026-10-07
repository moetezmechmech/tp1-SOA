package com.moetez.cours.restControllers;

import com.moetez.cours.config.Configuration;
import com.moetez.cours.dto.CoursDto;
import com.moetez.cours.service.CoursService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cours")
@RequiredArgsConstructor
@RefreshScope
public class CoursController {

    private final CoursService coursService;
    private final Configuration configuration;

    @Value("${build.version}")
    private String buildVersion;

    @GetMapping("{code}")
    public ResponseEntity<CoursDto> getCoursByCode(@PathVariable("code") String code) {
        return new ResponseEntity<>(coursService.getCoursByCode(code), HttpStatus.OK);
    }

    @GetMapping("/version")
    public ResponseEntity<String> version() {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName() + " " + configuration.getEmail());
    }
}