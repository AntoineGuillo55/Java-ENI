package Cycles;

import java.time.LocalDate;
import java.time.Period;

public abstract class Cycle {

	private LocalDate dateAchat;
	private String marque;
	private String modele;
	
	public Cycle(LocalDate dateAchat, String marque, String modele) {
		super();
		this.dateAchat = dateAchat;
		this.marque = marque;
		this.modele = modele;
	}
	
	

	/**
	 * @return the dateAchat
	 */
	public LocalDate getDateAchat() {
		return dateAchat;
	}



	/**
	 * @param dateAchat the dateAchat to set
	 */
	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}



	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}



	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}



	/**
	 * @return the modele
	 */
	public String getModele() {
		return modele;
	}



	/**
	 * @param modele the modele to set
	 */
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public String formatedDisplay90() {
		
		var max = 90;
		var leftSize = toString().length();
		var rightStr = getTarifLocationHeure() + "€/heures";
		var rightSize = rightStr.length();
		var bufferSize = max - rightSize - leftSize;
		var buffer = "";
		for(int i = 0; i < bufferSize; i++) {
			buffer += " ";
		}
		return toString()+buffer+rightStr;
		
	}



	public int age() {
		
	   
        LocalDate dateActuelle = LocalDate.now();


        Period difference = Period.between(dateAchat, dateActuelle);

        int ageEnAnnees = difference.getYears();
        
		return ageEnAnnees;
	};
	
	public abstract double getTarifLocationHeure();

	@Override
	public String toString() {
		return getClass().getSimpleName() +" " + getMarque() + " " + getModele() + " " + getDateAchat() + " (" + age() + "ans) ";
	}
	
}
