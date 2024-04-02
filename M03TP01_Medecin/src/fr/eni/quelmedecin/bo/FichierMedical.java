package fr.eni.quelmedecin.bo;

import java.time.LocalDate;

public class FichierMedical {

	private int poids;
	private int taille;
	private String tension;
	private int oxygenation;
	private int pulsation;
	private String probleme;
	private String prescription;
	private LocalDate dateSoin;
	private Patient patient;
	private Medecin medecin;
	
	public FichierMedical(int poids, int taille, String tension, int oxygenation, int pulsation, String probleme,
			String prescription, LocalDate dateSoin, Patient patient, Medecin medecin) {
		super();
		this.poids = poids;
		this.taille = taille;
		this.tension = tension;
		this.oxygenation = oxygenation;
		this.pulsation = pulsation;
		this.probleme = probleme;
		this.prescription = prescription;
		this.dateSoin = dateSoin;
		this.patient = patient;
		this.medecin = medecin;
	}

	/**
	 * @return the poids
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(int poids) {
		this.poids = poids;
	}

	/**
	 * @return the taille
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * @param taille the taille to set
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}

	/**
	 * @return the tension
	 */
	public String getTension() {
		return tension;
	}

	/**
	 * @param tension the tension to set
	 */
	public void setTension(String tension) {
		this.tension = tension;
	}

	/**
	 * @return the oxygenation
	 */
	public int getOxygenation() {
		return oxygenation;
	}

	/**
	 * @param oxygenation the oxygenation to set
	 */
	public void setOxygenation(int oxygenation) {
		this.oxygenation = oxygenation;
	}

	/**
	 * @return the pulsation
	 */
	public int getPulsation() {
		return pulsation;
	}

	/**
	 * @param pulsation the pulsation to set
	 */
	public void setPulsation(int pulsation) {
		this.pulsation = pulsation;
	}

	/**
	 * @return the probleme
	 */
	public String getProbleme() {
		return probleme;
	}

	/**
	 * @param probleme the probleme to set
	 */
	public void setProbleme(String probleme) {
		this.probleme = probleme;
	}

	/**
	 * @return the prescription
	 */
	public String getPrescription() {
		return prescription;
	}

	/**
	 * @param prescription the prescription to set
	 */
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	/**
	 * @return the dateSoin
	 */
	public LocalDate getDateSoin() {
		return dateSoin;
	}

	/**
	 * @param dateSoin the dateSoin to set
	 */
	public void setDateSoin(LocalDate dateSoin) {
		this.dateSoin = dateSoin;
	}

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
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
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	public String toString() {
		
		StringBuilder tmp = new StringBuilder();
		tmp.append("Fichier médical de : \n" + patient.toString() + "\n");
		tmp.append("Poid : ").append(poids).append(", taille : ").append(taille).append("\n").append("Tension : ").append(tension + ", saturation : " + oxygenation + ", pulsation : " + pulsation);
		tmp.append("Problème : " + probleme + "\n");
		tmp.append("Prescription : " + prescription + "\n");
		tmp.append("Date de soin : " + dateSoin + "\n");
		if(medecin instanceof MedecinGeneraliste) {
			tmp.append("Le médecin généraliste responsable : " + medecin.affichageSpécifique());
		}
		if(medecin instanceof MedecinSpecialiste) {
			tmp.append("Le médecin spécialiste responsable : " + medecin.affichageSpécifique());
		}
		
		
		
		return tmp.toString();
	}
	
	
	
}
