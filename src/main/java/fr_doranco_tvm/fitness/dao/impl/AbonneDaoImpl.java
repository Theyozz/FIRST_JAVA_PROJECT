package fr_doranco_tvm.fitness.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import fr_doranco_tvm.fitness.business.Abonne;
import fr_doranco_tvm.fitness.dao.AbonneDao;
import fr_doranco_tvm.fitness.dao.ConnexionBdd;
import fr_doranco_tvm.fitness.dao.Requetes;


public class AbonneDaoImpl implements AbonneDao{

	private Connection connexion;

	public AbonneDaoImpl() {
		try {
			connexion = ConnexionBdd.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Abonne ajouterAbonne(Abonne abonne) throws SQLException{
		PreparedStatement ps = connexion.prepareStatement(Requetes.AJOUT_ABONNE, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, abonne.getPrenom());
		ps.setString(2, abonne.getNom());
		ps.setTimestamp(3, Timestamp.valueOf(abonne.getDateHeureInscription()));
		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			abonne.setId(rs.getLong(1));
		}
		return abonne;
	}

	@Override
	public Abonne trouverAbonnerParId(Long id) throws SQLException {
		PreparedStatement ps = connexion.prepareStatement(Requetes.ABONNE_PAR_ID);
		ps.setLong(1, id);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Abonne abonne = new Abonne();
			abonne.setId(rs.getLong("Id_Abonne"));
			abonne.setPrenom(rs.getString("prenom"));
			abonne.setNom(rs.getString("nom"));
			return abonne;
		}
		return null;
	}

	@Override
	public List<Abonne> trouverTousLesAbonnes() throws SQLException {
		List<Abonne> abonnes = new ArrayList<>();

		PreparedStatement ps = connexion.prepareStatement(Requetes.TROUVER_TOUS_LES_ABONNES);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Abonne abonne = new Abonne();
			abonne.setId(rs.getLong("Id_Abonne"));
			abonne.setPrenom(rs.getString("prenom"));;
			abonne.setNom(rs.getString("nom"));
			abonnes.add(abonne);

		}
		return abonnes;
	}

	@Override
	public Abonne updateAbonne(Abonne abonne) throws SQLException {
		
		PreparedStatement ps = connexion.prepareStatement(Requetes.MODIFIER_ABONNE);
		ps.setString(1, abonne.getPrenom());
		ps.setString(2, abonne.getNom());
		ps.setLong(3, abonne.getId());
		ps.executeUpdate();

		return abonne;
	}

	@Override
	public boolean supprimer(Long id) throws SQLException {
		PreparedStatement ps = connexion.prepareStatement(Requetes.SUPPRIMER_ABONNE);
		ps.setLong(1, id);
		return ps.execute();
	};
	
	
}
