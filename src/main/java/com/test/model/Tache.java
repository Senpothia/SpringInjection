package com.test.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Tache implements Runnable{

	
	@Autowired 
	private Voiture voiture;
	
	
	@Override
	public void run() {
		
		for (int i=0; i<10; i++) {
			
			voiture.reparer();
		}
		
	
		
	}
	
	
	

}
