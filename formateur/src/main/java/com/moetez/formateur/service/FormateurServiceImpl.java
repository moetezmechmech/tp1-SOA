package com.moetez.formateur.service;

import com.moetez.formateur.dto.APIResponseDto;
import com.moetez.formateur.dto.CoursDto;
import com.moetez.formateur.dto.FormateurDto;
import com.moetez.formateur.entities.Formateur;
import com.moetez.formateur.repos.FormateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FormateurServiceImpl implements FormateurService {

    private FormateurRepository formateurRepository;
    private APIClient apiClient;

    @Override
    public APIResponseDto getFormateurById(Long id) {
        Formateur formateur = formateurRepository.findById(id).get();

        CoursDto coursDto = apiClient.getCoursByCode(formateur.getCodeCours());

        FormateurDto formateurDto = new FormateurDto(
                formateur.getId(),
                formateur.getNom(),
                formateur.getPrenom(),
                formateur.getCodeCours(),
                coursDto.getNomCours()
        );

        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setFormateurDto(formateurDto);
        apiResponseDto.setCoursDto(coursDto);
        return apiResponseDto;
    }
}