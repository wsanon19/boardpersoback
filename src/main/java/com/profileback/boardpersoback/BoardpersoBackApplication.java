package com.profileback.boardpersoback;

import com.profileback.boardpersoback.Model.Projet;
import com.profileback.boardpersoback.Service.ProjetService.ProjetService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Board Perso API", version = "1.0", description = "My dev Projects API"))
@Slf4j
public class BoardpersoBackApplication {

	@Bean
	CommandLineRunner run(ProjetService projetService) {
		return  args -> {
			List<Projet> allprojects = projetService.getall();
			log.info("Number of projects: " + allprojects.size());

			Projet newProjet = new Projet();
			newProjet.setNom("Développement Application web Java/Angular");
			newProjet.setDescription("Plateforme de cours en ligne permettant " +
					"d'avoir accès a des cours , d'interagir en direct avec des professeurs et de passer des tests ");
			newProjet.setDebut(new Date(1220227200L * 1000));
			newProjet.setFin(new Date());
			projetService.save(newProjet);

			allprojects = projetService.getall();
			log.info("Number of projects: " + allprojects.size());
		};
	}



	public static void main(String[] args) {
		SpringApplication.run(BoardpersoBackApplication.class, args);
	}



}
