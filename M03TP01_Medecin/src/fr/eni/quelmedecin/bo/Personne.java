package fr.eni.quelmedecin.bo;

import java.util.Comparator;

public abstract class Personne {
	
	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private Adresse adresse;
	private static final Comparator<Personne> comparatorNomPrenom = new PersonneComparatorNomPrenom();
	
	
	public Personne(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.adresse = adresse;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return the numeroDeTelephone
	 */
	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}


	/**
	 * @param numeroDeTelephone the numeroDeTelephone to set
	 */
	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public String toString() {

		return nom.toUpperCase() + " " + prenom + "\n" + "Téléphone : " + numeroDeTelephone;

	}

	public static Comparator<Personne> getComparatorNomPrenom() {
	    return comparatorNomPrenom;
	}
	
}
