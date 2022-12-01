/**
 * 
 */
package com.iiitb.dt.smartfactory.model;

/**
 * @author Ravi Shankar
 *
 */
public class SensorAttribute {
	private String manufacturer;
	private String location;
	private String mac;
	private String model;

	public SensorAttribute() {
		manufacturer = "";
		location = "";
		mac = "";
		model = "";
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public SensorAttribute setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public SensorAttribute setLocation(String location) {
		this.location = location;
		return this;
	}

	/**
	 * @return the mac
	 */
	public String getMac() {
		return mac;
	}

	/**
	 * @param mac the mac to set
	 */
	public SensorAttribute setMac(String mac) {
		this.mac = mac;
		return this;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public SensorAttribute setModel(String model) {
		this.model = model;
		return this;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[manufacturer: " + this.manufacturer + ", location: " + this.location + ", mac: " + this.mac
				+ ", model: " + this.model + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
