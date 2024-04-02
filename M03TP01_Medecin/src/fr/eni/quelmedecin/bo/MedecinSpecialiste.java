package fr.eni.quelmedecin.bo;

public class MedecinSpecialiste extends Medecin {

	private String specialite;

	public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		super(nom, prenom, numeroDeTelephone, adresse);
	}
	
	public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, int tarif) {
		super(nom, prenom, numeroDeTelephone, adresse);
		this.specialite = specialite;
		this.setTarif(tarif);
	}

	/**
	 * @return the specialite
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
}
