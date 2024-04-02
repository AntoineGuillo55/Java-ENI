package Cycles;

import java.time.LocalDate;

public class CycleElectrique extends Cycle implements Rechargeable {

	private int autonomieKm;
	private int percentBatteryLevel;
	private boolean isRentable = true;
	
	public CycleElectrique(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
		super(dateAchat, marque, modele);
		this.autonomieKm = autonomieKm;
	}
	
	

	/**
	 * @return the autonomieKm
	 */
	public int getAutonomieKm() {
		return autonomieKm;
	}



	/**
	 * @param autonomieKm the autonomieKm to set
	 */
	public void setAutonomieKm(int autonomieKm) {
		this.autonomieKm = autonomieKm;
	}

	@Override
	public String toString() {
		return super.toString() + getAutonomieKm() + " km d'autonomie ";
	}



	@Override
	public void charger() {
		
		setBatteryLevel(20);
	}



	@Override
	public int getBatteryLevel() {
	
		return percentBatteryLevel;
	}



	@Override
	public void setBatteryLevel(int percentBatteryLevelToSet) {
		// TODO Auto-generated method stub
		this.percentBatteryLevel+= percentBatteryLevelToSet;
	}



	@Override
	public double getTarifLocationHeure() {
		// TODO Auto-generated method stub
		return 0;
	}
}
