package fr_doranco_tvm.fitness.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr_doranco_tvm.fitness.business.Abonne;
import fr_doranco_tvm.fitness.business.Tapis;
import fr_doranco_tvm.fitness.dao.ConnexionBdd;
import fr_doranco_tvm.fitness.dao.Requetes;
import fr_doranco_tvm.fitness.dao.TapisDao;

public class TapisDaoImpl implements TapisDao{

	private Connection connexion;

	public TapisDaoImpl() {
		try {
			connexion = ConnexionBdd.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Tapis ajouterTapis(Tapis tapis) throws SQLException {
		
		PreparedStatement ps = connexion.prepareStatement(Requetes.AJOUT_TAPIS, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, tapis.getNom());
		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			tapis.setId(rs.getLong(1));
		}
		return tapis;
	}

	@Override
	public List<Tapis> trouverTousLesTapis() throws SQLException {
		
		List<Tapis> tapisTab = new ArrayList<>();

		PreparedStatement ps = connexion.prepareStatement(Requetes.TROUVER_TOUS_LES_TAPIS);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			Tapis tapis = new Tapis();
			tapis.setId(rs.getLong("Id_Tapis"));
			tapis.setNom(rs.getString("nom"));
			tapisTab.add(tapis);

		}
		return tapisTab;
	}

	@Override
	public Tapis updateTapis(Tapis tapis) throws SQLException {
		
		PreparedStatement ps = connexion.prepareStatement(Requetes.MODIFIER_TAPIS);
		ps.setString(1, tapis.getNom());
		ps.setLong(2, tapis.getId());
		ps.executeUpdate();

		return tapis;
	}

	@Override
	public Tapis trouverTapisParSonId(long id) throws SQLException {
		
		PreparedStatement ps = connexion.prepareStatement(Requetes.TAPIS_PAR_ID);
		ps.setLong(1, id);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			Tapis tapis = new Tapis();
			tapis.setId(rs.getLong("Id_Tapis"));
			tapis.setNom(rs.getString("nom"));
			return tapis;
		}
		return null;
	}
}
