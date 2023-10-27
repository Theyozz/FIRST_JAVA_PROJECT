package fr_doranco_tvm.fitness.service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import fr_doranco_tvm.fitness.business.Abonne;

public interface AbonneService {

	Abonne ajouterAbonne(String nom, String prenom);
	
	Abonne trouverAbonnerParId(Long id);
	
	List<Abonne> trouverTousLesAbonnes();
	
	Abonne updateAbonne(Abonne abonne);
	
	boolean supprimer(Long id);
}
