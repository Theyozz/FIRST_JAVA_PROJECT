package fr_doranco_tvm.fitness.business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Abonne {

	private long id;
	private String prenom;
	private String nom;
	private LocalDateTime dateHeureInscription;
	
	private List<Course> Course;
	
	public Abonne() {
		super();
		Course = new ArrayList<>();
	}
	
	public Abonne(String prenom,String nom, LocalDateTime dateHeureInscription) {
		this();
		this.prenom = prenom;
		this.nom = nom;
		this.dateHeureInscription = dateHeureInscription;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDateTime getDateHeureInscription() {
		return dateHeureInscription;
	}

	public void setDateHeureInscription(LocalDateTime dateHeureInscription) {
		this.dateHeureInscription = dateHeureInscription;
	}

	public List<Course> getCourse() {
		return Course;
	}

	public void setCourse(List<Course> course) {
		Course = course;
	}

	@Override
	public String toString() {
		return "Abonne [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", dateHeureInscription="
				+ dateHeureInscription + ", Course=" + Course + "]";
	}
	
	
	
}
