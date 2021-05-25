package com.example.demo.Models;


public class Etudiant {
	 private Long id;
	    private String Nom;
	    private String Prenom;
	    
	    public Long getId(){
	        return this.id;
	    }
	    
	    public String getNom(){
	        return this.Nom;
	    }
	    
	    public void setNom(String Nom){
	        this.Nom = Nom;
	    }
	    
	    public String getPrenom(){
	        return this.Prenom;
	    }
	    
	    public void setPrenom(String Prenom){
	        this.Prenom = Prenom;
	    }
	    
	    public Etudiant() {
	        
	    }
	    
	    public Etudiant(Long id , String Nom , String Prenom){
	        this.id = id;
	        this.Nom = Nom;
	        this.Prenom = Prenom;
	    }
	    
	     public Etudiant( String Nom , String Prenom){
	      
	        this.Nom = Nom;
	        this.Prenom = Prenom;
	    }

		@Override
		public String toString() {
			return "Etudiant [id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + "]";
		}
	     
	     
	    
}

