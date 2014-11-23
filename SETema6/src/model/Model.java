/**
 * 
 */
package model;

/**
 * @author IulianC
 *
 */
public class Model {
	public static final String DEFAULT_TEMEPERATURE = "10 grade Celsius";
	public static final String DEFAULT_WINDSPEED = "10 km/h";

	private String mTemperature;
	private String mWindSpeed;

	/**
	 * @param mTemperature
	 *            the mTemperature to set
	 */
	public void setWeatherDetails(String mTemperature, String mWindSpeed) {
		this.mWindSpeed = mWindSpeed;
		this.mTemperature = mTemperature;
	}

	public String[] getWeatherDetails() {
		String[] details = { mTemperature, mWindSpeed };
		return details;
	}

}
