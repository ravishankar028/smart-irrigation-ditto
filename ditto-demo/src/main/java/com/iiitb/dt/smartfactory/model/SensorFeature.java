/**
 * 
 */
package com.iiitb.dt.smartfactory.model;

/**
 * @author Ravi Shankar
 *
 */
public class SensorFeature {

	private SoilMoistureProperty moisture;
	private TemperatureAttribute temperature;

	/**
	 * @return the moisture
	 */
	public SoilMoistureProperty getMoisture() {
		return moisture;
	}

	/**
	 * @param moisture the moisture to set
	 */
	public void setMoisture(SoilMoistureProperty moisture) {
		this.moisture = moisture;
	}

	/**
	 * @return the temperature
	 */
	public TemperatureAttribute getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(TemperatureAttribute temperature) {
		this.temperature = temperature;
	}

}
