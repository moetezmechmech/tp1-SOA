package com.moetez.cours.service;

import com.moetez.cours.dto.CoursDto;

public interface CoursService {
    CoursDto getCoursByCode(String code);
}