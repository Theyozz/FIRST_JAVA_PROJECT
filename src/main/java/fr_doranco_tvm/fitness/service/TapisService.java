package fr_doranco_tvm.fitness.service;

import java.sql.SQLException;
import java.util.List;

import fr_doranco_tvm.fitness.business.Tapis;

public interface TapisService {

	Tapis ajouterTapis(String nom);
	
	List<Tapis> trouverTousLesTapis();
	
	Tapis updateTapis(Tapis tapis);
	
	Tapis trouverTapisParSonId(long id);
}
