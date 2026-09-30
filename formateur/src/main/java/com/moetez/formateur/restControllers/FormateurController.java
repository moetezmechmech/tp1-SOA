package com.moetez.formateur.restControllers;

import com.moetez.formateur.dto.APIResponseDto;
import com.moetez.formateur.service.FormateurService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/formateurs")
@AllArgsConstructor
public class FormateurController {

    private FormateurService formateurService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getFormateurById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(formateurService.getFormateurById(id), HttpStatus.OK);
    }
}