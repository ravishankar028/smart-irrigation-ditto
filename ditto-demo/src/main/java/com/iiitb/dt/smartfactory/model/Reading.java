/**
 * 
 */
package com.iiitb.dt.smartfactory.model;

/**
 * @author Ravi Shankar
 *
 */
public class Reading {
	private double value;
	private String timestamp;

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
