package fr_doranco_tvm.fitness.dao;

public class Requetes {

	// Abonne
	public static final String AJOUT_ABONNE = "INSERT INTO `abonne`(`prenom`, `nom`, `dateInscription`) VALUES (?,?,?)";
	public static final String ABONNE_PAR_ID = "SELECT `Id_Abonne`, `prenom`, `nom`, `dateInscription` FROM `abonne` WHERE Id_Abonne = ?";
	public static final String TROUVER_TOUS_LES_ABONNES = "SELECT `Id_Abonne`, `prenom`, `nom`, `dateInscription` FROM `abonne`";
	public static final String MODIFIER_ABONNE = "UPDATE `abonne` SET `prenom`=?,`nom`=? WHERE Id_Abonne = ?";
	public static final String SUPPRIMER_ABONNE = "DELETE FROM `abonne` WHERE Id_Abonne = ?";
	
	// Course
	public static final String AJOUT_COURSE = "INSERT INTO `course`(`dateHeureDebut`, `dureeEnMinutes`, `distanceEnMetres`, `Id_Tapis`, `Id_Abonne`) VALUES (?,?,?,?,?)";
	public static final String SUPPRIMER_COURSE = "DELETE FROM `course` WHERE ?";
	
	// Tapis
	public static final String AJOUT_TAPIS = "INSERT INTO `tapis`(`nom`) VALUES (?)";
	public static final String TROUVER_TOUS_LES_TAPIS = "SELECT `Id_Tapis`, `nom` FROM `tapis`";
	public static final String TAPIS_PAR_ID = "SELECT `Id_Tapis`, `nom` FROM `tapis` WHERE Id_Tapis=?";
	public static final String MODIFIER_TAPIS = "UPDATE `tapis` SET `nom`=? WHERE ?";
}
