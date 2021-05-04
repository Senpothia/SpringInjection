package com.test.model;

import org.springframework.stereotype.Component;


public class Voiture {
	
	private Personne proprietaire;
	private String marque;
	private int puissance;
	
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Voiture(Personne proprietaire, String marque, int puissance) {
		super();
		this.proprietaire = proprietaire;
		this.marque = marque;
		this.puissance = puissance;
	}
	public Personne getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	
	public void rouler() {
		
		System.out.println("La voiture roule");
		System.out.println("Le propriétaire est: " + this.proprietaire.getNom());
	}
	public void reparer() {
		
		System.out.println("Je répare la voiture");
		
	}
	
	

}
