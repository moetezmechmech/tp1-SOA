package com.moetez.cours.service;

import com.moetez.cours.dto.CoursDto;
import com.moetez.cours.entities.Cours;
import com.moetez.cours.repos.CoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@AllArgsConstructor
@Service
public class CoursServiceImpl implements CoursService {

    private CoursRepository coursRepository;

    @Override
    public CoursDto getCoursByCode(String code) {
        Cours cours = coursRepository.findByCodeCours(code);
        if (cours == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Cours introuvable : " + code);
        }
        return new CoursDto(
                cours.getId(),
                cours.getNomCours(),
                cours.getCodeCours()
        );
    }
}