package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Utilisateur;
import com.test.repositoty.UtilisateurRepo;



@Service
public class UtilisateurService  {
	
	@Autowired
	UtilisateurRepo utilisateurRepo;
	
	
	public void enregistrer(Utilisateur utilisateur){
		
		utilisateurRepo.save(utilisateur);
		
	}
	
	

}