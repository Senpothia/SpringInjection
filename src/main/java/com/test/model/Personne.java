package com.test.model;

import org.springframework.stereotype.Component;


public class Personne {
	
	private String nom;
	private int age;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
