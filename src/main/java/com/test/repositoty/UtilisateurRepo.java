package com.test.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.model.Utilisateur;



public interface UtilisateurRepo extends JpaRepository<Utilisateur, Integer>{
	
	

}
