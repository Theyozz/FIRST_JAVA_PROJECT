package fr_doranco_tvm.fitness.service.impl;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import fr_doranco_tvm.fitness.business.Abonne;
import fr_doranco_tvm.fitness.dao.AbonneDao;
import fr_doranco_tvm.fitness.dao.impl.AbonneDaoImpl;
import fr_doranco_tvm.fitness.service.AbonneService;

public class AbonneServiceImpl implements AbonneService {
	private AbonneDao abonneDao = new AbonneDaoImpl();

	@Override
	public Abonne ajouterAbonne(String nom, String prenom) {
		
		Abonne abonne = new Abonne(nom,prenom, LocalDateTime.now());

		try {
			abonneDao.ajouterAbonne(abonne);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return abonne;
	}

	@Override
	public Abonne trouverAbonnerParId(Long id) {
		try {
			return abonneDao.trouverAbonnerParId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Abonne> trouverTousLesAbonnes() {
		try {
			return abonneDao.trouverTousLesAbonnes();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	@Override
	public Abonne updateAbonne(Abonne abonne){
		try {
			return abonneDao.updateAbonne(abonne);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return abonne;
	}

	@Override
	public boolean supprimer(Long id){
		try {
			return abonneDao.supprimer(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
