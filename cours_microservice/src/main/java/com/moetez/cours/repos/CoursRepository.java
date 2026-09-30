package com.moetez.cours.repos;

import com.moetez.cours.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Long> {

    Cours findByCodeCours(String code);
}