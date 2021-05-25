package com.example.demo.restController;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Models.Etudiant;
import com.example.demo.Models.ListEtudiant;


@org.springframework.web.bind.annotation.RestController

@RequestMapping("/etudiant")
public class RestController {
	
	@Autowired
	private ListEtudiant le;
	

	
	@GetMapping(path="addstudent/{id}/{nom}/{prenom}",produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Etudiant> ajoutEtudiantdansListe(@PathVariable("id") Long id , @PathVariable("nom") String nom,@PathVariable("prenom") String prenom   ) {
		
		 le.ajoutEtudiantdansListe(new Etudiant(id,nom,prenom));
		 le.ConsultEtudiant(id);	
		 
		 return le.ConsultListEtudiant();
	}
	
	@GetMapping(path="searchstudent/{id}" , produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
	public Etudiant ConsultEtudiant(@PathVariable("id") Long id) {
		return le.ConsultEtudiant(id);
		
	}
	
	@GetMapping(path = "deletestudent/{id}" , produces =  {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Etudiant> supprimEtudiant(@PathVariable("id") Long id){
		
		le.supprimEtudiant(id);
		
		return le.ConsultListEtudiant();
		
	}
	
	@GetMapping(path = "editstudent/{id}/{nom}/{prenom}" , produces =  {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
	public ArrayList<Etudiant> modifEtudiant(@PathVariable("id") Long id , @PathVariable("nom") String nom,@PathVariable("prenom") String prenom ){
		le.modifEtudiant(id, new Etudiant(id, nom, prenom));
		
		return le.ConsultListEtudiant();
	}
	

	

}
