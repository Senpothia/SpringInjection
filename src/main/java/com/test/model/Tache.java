package com.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.service.UtilisateurService;

@Service
public class Tache implements Runnable{

	
	@Autowired 
	private Voiture voiture;
	
	@Autowired
	private UtilisateurService utilisateurService;
	
	
	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			
			voiture.reparer();
		}
		
		Utilisateur user = new Utilisateur();
		user.setEmail("michel@hotmail.fr");
		user.setNom("LOPEZ");
		user.setPassword("123456");
		user.setPrenom("Michel");
		user.setRole("ADMIN");
		utilisateurService.enregistrer(user);
		
	
		
	}
	
	
	

}
