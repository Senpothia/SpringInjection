package com.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.test.logique.Metier;
import com.test.model.Personne;
import com.test.model.Voiture;

@Configuration
public class Config {
	
	@Bean
	public Voiture getVoiture(Personne proprietaire) {
		
		Voiture voiture = new Voiture(proprietaire, "Ford", 120);
	//	voiture.rouler();
		return voiture;
	}
	
	@Bean
	@Primary
	public Personne getPersonne() {
		
		Personne personne = new Personne("Michel", 25);
		return personne;
		
	}
	
	/*
	@Bean
	public Metier getMetier(Voiture voiture) {
		
		return new Metier(voiture);
	}
*/
}
