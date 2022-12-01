/**
 * 
 */
package com.iiitb.dt.smartfactory.model;

/**
 * @author Ravi Shankar
 *
 */
public class DittoThing {
	// private String thingId;
	private SensorAttribute attributes;
	private SensorFeature features;

	public DittoThing() {
		attributes = new SensorAttribute();
		features = new SensorFeature();
	}
	/**
	 * @return the attributes
	 */
	public SensorAttribute getAttributes() {
		return attributes;
	}

	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(SensorAttribute attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the features
	 */
	public SensorFeature getFeatures() {
		return features;
	}

	/**
	 * @param features the features to set
	 */
	public void setFeatures(SensorFeature features) {
		this.features = features;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DittoThing[attributes: " + this.attributes.toString() + ", features: "
				+ this.features.toString() + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
