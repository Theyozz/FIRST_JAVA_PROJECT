package fr_doranco_tvm.fitness.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import fr_doranco_tvm.fitness.business.Course;
import fr_doranco_tvm.fitness.dao.ConnexionBdd;
import fr_doranco_tvm.fitness.dao.CourseDao;
import fr_doranco_tvm.fitness.dao.Requetes;

public class CourseDaoImpl implements CourseDao{

	private Connection connexion;

	public CourseDaoImpl() {
		try {
			connexion = ConnexionBdd.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Course ajouterCourse(Course course) throws SQLException {
		
		PreparedStatement ps = connexion.prepareStatement(Requetes.AJOUT_COURSE, Statement.RETURN_GENERATED_KEYS);
		ps.setTimestamp(1, Timestamp.valueOf(course.getDateHeureDebut()));
		ps.setInt(2, course.getDureeEnMinutes());
		ps.setInt(3, course.getDistanceEnMetres());
		ps.setLong(4, course.getAbonne().getId());
		ps.setLong(5, course.getTapis().getId());
		ps.executeUpdate();

		ResultSet rs = ps.getGeneratedKeys();
		if (rs.next()) {
			course.setId(rs.getLong(1));
		}
		return course;
	}

	@Override
	public boolean deleteCourse(Long id) throws SQLException {
		
		PreparedStatement ps = connexion.prepareStatement(Requetes.SUPPRIMER_COURSE);
		ps.setLong(1, id);
		return ps.execute();
	}

}
