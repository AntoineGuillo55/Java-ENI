package Cycles;

public interface Rechargeable {

	public static final int MINIMUM_PERCENT_LEVEL = 30;
	
	public void charger();

	/**
	 * @return the percentBatteryLevel
	 */
	public int getBatteryLevel();

	/**
	 * @param percentBatteryLevel the percentBatteryLevel to set
	 */
	public void setBatteryLevel(int percentBatteryLevelToSet);
	
	
}
