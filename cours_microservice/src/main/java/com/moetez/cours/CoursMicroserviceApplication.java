package com.moetez.cours;

import com.moetez.cours.entities.Cours;
import com.moetez.cours.repos.CoursRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoursMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CoursRepository coursRepository) {
        return args -> {
            coursRepository.save(Cours.builder()
                    .nomCours("Spring Cloud")
                    .codeCours("SC")
                    .build());

            coursRepository.save(Cours.builder()
                    .nomCours("Angular")
                    .codeCours("NG")
                    .build());
        };
    }
}