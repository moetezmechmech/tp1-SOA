package com.moetez.cours.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoursDto {
    private Long id;
    private String nomCours;
    private String codeCours;
}