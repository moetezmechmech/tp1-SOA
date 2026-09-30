package com.moetez.formateur.repos;

import com.moetez.formateur.entities.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormateurRepository extends JpaRepository<Formateur, Long> {
}