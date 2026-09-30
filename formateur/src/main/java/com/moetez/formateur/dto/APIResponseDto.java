package com.moetez.formateur.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private FormateurDto formateurDto;
    private CoursDto coursDto;
}