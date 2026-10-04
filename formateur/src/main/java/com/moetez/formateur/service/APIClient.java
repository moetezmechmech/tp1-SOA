package com.moetez.formateur.service;

import com.moetez.formateur.dto.CoursDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8082", name = "COURS")
@FeignClient(name = "COURS")
public interface APIClient {

    @GetMapping("api/cours/{cours-code}")
    CoursDto getCoursByCode(@PathVariable("cours-code") String coursCode);
}