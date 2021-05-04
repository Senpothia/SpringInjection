package com.test;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.logique.Metier;
import com.test.model.Personne;
import com.test.model.Tache;
import com.test.model.Voiture;

@SpringBootApplication
public class SpringInjectionApplication {
	

@Autowired
public static Metier metier;

	public static void main(String[] args) {
		
		ConfigurableApplicationContext contexte =  SpringApplication.run(SpringInjectionApplication.class, args);
		Voiture v = contexte.getBean(Voiture.class);
		v.rouler();
		Metier  metier = contexte.getBean(Metier.class);
		metier.action();
		Tache tache = contexte.getBean(Tache.class);
		tache.run();
		
	}

}
