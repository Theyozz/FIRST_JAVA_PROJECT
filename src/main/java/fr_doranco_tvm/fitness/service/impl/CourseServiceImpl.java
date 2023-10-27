package fr_doranco_tvm.fitness.service.impl;

import java.sql.SQLException;
import java.time.LocalDateTime;

import fr_doranco_tvm.fitness.business.Abonne;
import fr_doranco_tvm.fitness.business.Course;
import fr_doranco_tvm.fitness.business.Tapis;
import fr_doranco_tvm.fitness.dao.CourseDao;
import fr_doranco_tvm.fitness.dao.impl.CourseDaoImpl;
import fr_doranco_tvm.fitness.service.CourseService;

public class CourseServiceImpl implements CourseService {
	private CourseDao courseDao = new CourseDaoImpl();

	@Override
	public Course ajouterCourse(LocalDateTime dateHeureDebut, int distanceEnMetre, int dureeEnMinutes, Abonne abonne, Tapis tapis){
		
		Course course = new Course(LocalDateTime.now(),distanceEnMetre,dureeEnMinutes,abonne,tapis);

		try {
			courseDao.ajouterCourse(course);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return course;
	}

	@Override
	public boolean deleteCourse(Long id){
		try {
			return courseDao.deleteCourse(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
