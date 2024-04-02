package Cycles;

import java.time.LocalDate;

public class Velo extends Cycle{

	private int nbVitesses;
	private static final double PRIX_LOCATION = 4.90;
	
	public Velo(LocalDate dateAchat, String marque, String modele, int nbVitesses) {
		super(dateAchat, marque, modele);
		this.nbVitesses = nbVitesses;
	}
	
	
	
	/**
	 * @return the nbVitesses
	 */
	public int getNbVitesses() {
		return nbVitesses;
	}



	/**
	 * @param nbVitesses the nbVitesses to set
	 */
	public void setNbVitesses(int nbVitesses) {
		this.nbVitesses = nbVitesses;
	}



	/**
	 * @return the prixLocation
	 */
	public static double getPrixLocation() {
		return PRIX_LOCATION;
	}


	@Override
	public double getTarifLocationHeure() {
		
		return PRIX_LOCATION;
	}
	
	@Override
	public String toString() {
		return super.toString() + getNbVitesses() + " vitesses ";
	}
	
}
