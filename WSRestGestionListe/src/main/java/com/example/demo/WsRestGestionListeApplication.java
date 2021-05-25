package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Models.Etudiant;
import com.example.demo.Models.ListEtudiant;

@SpringBootApplication
public class WsRestGestionListeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsRestGestionListeApplication.class, args);
	}
	
	@Bean
	
	CommandLineRunner start(ListEtudiant le){

        return args -> {
         /*   compteRepositories.save(new Compte(null,Math.random()*5421 ,new Date(), typeCompte.COURANT));
            compteRepositories.save(new Compte(null,Math.random()*54789,new Date(),typeCompte.EPARGNE));
            compteRepositories.save(new Compte(null,46576.4,new Date(),typeCompte.EPARGNE));
            compteRepositories.findAll().forEach(compte -> System.out.println(compte.toString()));
           */ 
            le.ajoutEtudiantdansListe(new Etudiant(1L,"m","m"));
            le.ajoutEtudiantdansListe(new Etudiant(2L,"n","n"));
            le.ajoutEtudiantdansListe(new Etudiant(3L,"o","o"));
            
            le.ConsultListEtudiant();
        };
    };

}
