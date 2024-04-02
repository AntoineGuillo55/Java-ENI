package fr.eni.quelmedecin.bo;

import java.time.LocalDate;

public class RendezVous {

	private Creneau creneau;
	private Patient patient;
	private LocalDate date;
	
	public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
		super();
		this.creneau = creneau;
		this.patient = patient;
		this.date = date;
		patient.prendreRdv(this);
	}

	/**
	 * @return the creneau
	 */
	public Creneau getCreneau() {
		return creneau;
	}

	/**
	 * @param creneau the creneau to set
	 */
	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
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
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String toString() {
		
		StringBuilder tmp = new StringBuilder();
		
		tmp.append("Rendez-vous du " + date + " ");
		tmp.append(creneau.toString() + "\n");
		tmp.append("Avec le Dr " + creneau.getMedecin().getNom() + "\n");
		tmp.append("Pour : " + patient.toString());
		
		return tmp.toString();
	}

}
