package fr_doranco_tvm.fitness.service;

import java.sql.SQLException;
import java.time.LocalDateTime;

import fr_doranco_tvm.fitness.business.Abonne;
import fr_doranco_tvm.fitness.business.Course;
import fr_doranco_tvm.fitness.business.Tapis;

public interface CourseService {

	Course ajouterCourse(LocalDateTime dateHeureDebut, int distanceEnMetre, int dureeEnMinutes, Abonne abonne, Tapis tapis);
	
	boolean deleteCourse(Long id);
}
