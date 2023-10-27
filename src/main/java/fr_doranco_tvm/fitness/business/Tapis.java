package fr_doranco_tvm.fitness.business;

public class Tapis {
	
	private long id;
	private String nom;
	
	public Tapis() {
		super();
	}

	public Tapis(String nom) {
		this();
		this.nom = nom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Tapis [id=" + id + ", nom=" + nom + "]";
	}
	
	


}
