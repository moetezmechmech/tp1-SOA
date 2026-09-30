package com.moetez.formateur.service;

import com.moetez.formateur.dto.APIResponseDto;

public interface FormateurService {
    APIResponseDto getFormateurById(Long id);
}