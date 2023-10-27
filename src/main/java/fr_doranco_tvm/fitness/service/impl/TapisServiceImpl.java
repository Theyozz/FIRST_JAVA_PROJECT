package fr_doranco_tvm.fitness.service.impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import fr_doranco_tvm.fitness.business.Tapis;
import fr_doranco_tvm.fitness.dao.TapisDao;
import fr_doranco_tvm.fitness.dao.impl.TapisDaoImpl;
import fr_doranco_tvm.fitness.service.TapisService;

public class TapisServiceImpl implements TapisService {
	private TapisDao tapisDao = new TapisDaoImpl();

	@Override
	public Tapis ajouterTapis(String nom){
		
		Tapis tapis = new Tapis(nom);

		try {
			tapisDao.ajouterTapis(tapis);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tapis;
	}

	@Override
	public List<Tapis> trouverTousLesTapis(){
		try {
			return tapisDao.trouverTousLesTapis();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	@Override
	public Tapis updateTapis(Tapis tapis){
		try {
			return tapisDao.updateTapis(tapis);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tapis;
	}

	@Override
	public Tapis trouverTapisParSonId(long id) {
		try {
			return tapisDao.trouverTapisParSonId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
