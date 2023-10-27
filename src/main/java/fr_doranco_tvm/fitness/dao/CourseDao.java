package fr_doranco_tvm.fitness.dao;

import java.sql.SQLException;

import fr_doranco_tvm.fitness.business.Course;


public interface CourseDao {

	Course ajouterCourse(Course Course) throws SQLException;
	
	boolean deleteCourse(Long id) throws SQLException;
}
