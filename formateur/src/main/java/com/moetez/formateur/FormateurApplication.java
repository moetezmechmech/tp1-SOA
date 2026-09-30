package com.moetez.formateur;

import com.moetez.formateur.entities.Formateur;
import com.moetez.formateur.repos.FormateurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class FormateurApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormateurApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(FormateurRepository formateurRepository) {
		return args -> {
			formateurRepository.save(Formateur.builder()
					.nom("Mechmech")
					.prenom("Moetez")
					.codeCours("SC")
					.build());
		};
	}
}