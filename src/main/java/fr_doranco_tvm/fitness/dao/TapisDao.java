package fr_doranco_tvm.fitness.dao;

import java.sql.SQLException;
import java.util.List;

import fr_doranco_tvm.fitness.business.Tapis;


public interface TapisDao {

	Tapis ajouterTapis(Tapis Tapis) throws SQLException;
	
	List<Tapis> trouverTousLesTapis() throws SQLException;
	
	Tapis updateTapis(Tapis tapis) throws SQLException;
	
	Tapis trouverTapisParSonId(long id) throws SQLException;
}
