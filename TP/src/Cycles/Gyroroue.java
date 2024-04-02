package Cycles;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique {
	
	private static final double PRIX_LOCATION = 18.90;
	
	public Gyroroue(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
		super(dateAchat, marque, modele, autonomieKm);
		
	}

	@Override
	public double getTarifLocationHeure() {
		
		return PRIX_LOCATION;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
