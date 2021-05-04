package com.test.logique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Voiture;

@Service
public class Metier {
	
	@Autowired
	private Voiture voiture;
	
	
	
	public Metier() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Metier(Voiture voiture) {
		super();
		this.voiture = voiture;
		voiture.rouler();
	}



	public void action() {
		
		voiture.rouler();
	}
	
	

}
