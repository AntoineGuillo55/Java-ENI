package fr.eni.quelmedecin.bo;

import java.time.LocalTime;

public class Creneau {
	
	private LocalTime debutCreneau;
	private int dureeCreneau;
	private Medecin medecin;
	
	

	public Creneau(LocalTime debutCreneau, int dureeCreneau, Medecin medecin) {
		super();
		this.debutCreneau = debutCreneau;
		this.dureeCreneau = dureeCreneau;
		this.medecin = medecin;
		medecin.ajouterCreneau(this);
		
	}


	/**
	 * @return the debutCreneau
	 */
	public LocalTime getDebutCreneau() {
		return debutCreneau;
	}



	/**
	 * @param debutCreneau the debutCreneau to set
	 */
	public void setDebutCreneau(LocalTime debutCreneau) {
		this.debutCreneau = debutCreneau;
	}



	/**
	 * @return the dureeCreneau
	 */
	public int getDureeCreneau() {
		return dureeCreneau;
	}



	/**
	 * @param dureeCreneau the dureeCreneau to set
	 */
	public void setDureeCreneau(int dureeCreneau) {
		this.dureeCreneau = dureeCreneau;
	}



	/**
	 * @return the medecin
	 */
	public Medecin getMedecin() {
		return medecin;
	}



	/**
	 * @param medecin the medecin to set
	 */
	public void setMedecin(MedecinGeneraliste medecin) {
		this.medecin = medecin;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String toString() {
		String tmp = debutCreneau + " - " + debutCreneau.plusMinutes(dureeCreneau) + " (" + dureeCreneau + " minutes)";
		
		return tmp;
	}

}
