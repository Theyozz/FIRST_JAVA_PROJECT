package fr_doranco_tvm.fitness.dao;

import java.sql.SQLException;
import java.util.List;

import fr_doranco_tvm.fitness.business.Abonne;


public interface AbonneDao {

	Abonne ajouterAbonne(Abonne abonne) throws SQLException;
	
	Abonne trouverAbonnerParId(Long id) throws SQLException;
	
	List<Abonne> trouverTousLesAbonnes() throws SQLException;
	
	Abonne updateAbonne(Abonne abonne) throws SQLException;
	
	boolean supprimer(Long id) throws SQLException;
}
