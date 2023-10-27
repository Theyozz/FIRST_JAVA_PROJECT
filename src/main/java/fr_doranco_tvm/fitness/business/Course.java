package fr_doranco_tvm.fitness.business;

import java.time.LocalDateTime;

public class Course {
	
	private long id;
	private LocalDateTime dateHeureDebut;
	private int distanceEnMetres;
	private int dureeEnMinutes;
	
	private Abonne abonne;
	private Tapis tapis;
	
	public Course() {
		super();
	}
	
	public Course(LocalDateTime dateHeureDebut, int distanceEnMetre, int dureeEnMinutes, Abonne abonne, Tapis tapis) {
		this();
		this.dateHeureDebut = dateHeureDebut;
		this.distanceEnMetres = distanceEnMetre;
		this.dureeEnMinutes = dureeEnMinutes;
		this.abonne = abonne;
		this.tapis = tapis;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getDateHeureDebut() {
		return dateHeureDebut;
	}

	public void setDateHeureDebut(LocalDateTime dateHeureDebut) {
		this.dateHeureDebut = dateHeureDebut;
	}

	public int getDistanceEnMetres() {
		return distanceEnMetres;
	}

	public void setDistanceEnMetres(int distanceEnMetres) {
		this.distanceEnMetres = distanceEnMetres;
	}

	public Abonne getAbonne() {
		return abonne;
	}

	public void setAbonne(Abonne abonne) {
		this.abonne = abonne;
	}

	public Tapis getTapis() {
		return tapis;
	}

	public void setTapis(Tapis tapis) {
		this.tapis = tapis;
	}


	public int getDureeEnMinutes() {
		return dureeEnMinutes;
	}

	public void setDureeEnMinutes(int dureeEnMinutes) {
		this.dureeEnMinutes = dureeEnMinutes;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", dateHeureDebut=" + dateHeureDebut + ", distanceEnMetres=" + distanceEnMetres
				+ ", abonne=" + abonne + ", tapis=" + tapis + "]";
	}
	
	

}
