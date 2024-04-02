package Cycles;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique {

	private int tailleMinCm;
	private static final double PRIX_LOCATION = 29.90;
	
	public Gyropode(LocalDate dateAchat, String marque, String modele, int autonomieKm, int tailleMinCm) {
		super(dateAchat, marque, modele, autonomieKm);
		this.tailleMinCm = tailleMinCm;
	}
	
	

	/**
	 * @return the tailleMinCm
	 */
	public int getTailleMinCm() {
		return tailleMinCm;
	}



	/**
	 * @param tailleMinCm the tailleMinCm to set
	 */
	public void setTailleMinCm(int tailleMinCm) {
		this.tailleMinCm = tailleMinCm;
	}



	@Override
	public double getTarifLocationHeure() {
		
		return PRIX_LOCATION;
	}



	@Override
	public String toString() {
		return super.toString() + "[" + getTailleMinCm() + "cm min] ";
	}
	
	
}
