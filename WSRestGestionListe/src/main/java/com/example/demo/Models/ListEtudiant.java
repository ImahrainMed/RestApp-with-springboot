package com.example.demo.Models;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ListEtudiant {
		
	  private ArrayList<Etudiant> ListEtudiants;
	    
	    
	  ArrayList<Etudiant> getListEtudiant(){
	        return this.ListEtudiants;
	    }
	    
	     public void setListEtudiant(ArrayList<Etudiant> ListEtudiants ){
	         this.ListEtudiants = ListEtudiants;
	    }
	     
	   public ListEtudiant(ArrayList<Etudiant> ListEtudiants ) {
		   
		   this.ListEtudiants = ListEtudiants;
		  
	   }
	     
	     
	     public void ajoutEtudiantdansListe(Etudiant e){
	         ListEtudiants.add(e);
	         System.out.println("+ 1 () ajouter avec succées");
	     }
	     
	     public void modifEtudiant(Long id, Etudiant e){
	         for (Etudiant etudiant : ListEtudiants) {
	             if(etudiant.getId() == id){
	            	 etudiant.setNom(e.getNom());
	            	 etudiant.setPrenom(e.getPrenom());
	             }
	         }
	         
	         System.out.println("+ 1 () modifier avec succées");
	     }
	     
	     public Etudiant ConsultEtudiant(Long id){
	       Etudiant e = new Etudiant();
	          for (Etudiant etudiant : ListEtudiants)
	              if(etudiant.getId()==id)
	            	  	e = etudiant;
	          
			return e; 
	             
	     }
	     
	     public ArrayList<Etudiant> ConsultListEtudiant(){
	         
	        
	           
	           return ListEtudiants;
	     }
	     
	     public void supprimEtudiant(Long id){
	          for (Etudiant etudiant : ListEtudiants){
	              if(etudiant.getId().equals(id) ){
	                  ListEtudiants.remove(etudiant);
	                 break;
	              }
	                   
	          }
	          System.out.println("+ 1 () Supprimé avec succées");
	     }
	     
	 
}
