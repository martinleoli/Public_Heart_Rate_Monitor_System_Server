package database.data;

import database.interfaces.Coordinate;

/**
 * This object contains coordinate information
 * 
 * @author Bing Li
 *
 */
public class Location implements Coordinate {

	private double longtitude;
	private double latitude;

	/**
	 * test constructor
	 */
	public Location() {

		this(0, 0);
	}

	/**
	 * This is the default constructor
	 * 
	 * @param longtitude
	 *            a double number present longtitude
	 * @param latitude
	 *            a double number present latitude
	 */
	public Location(double longtitude, double latitude) {
		this.latitude = latitude;
		this.longtitude = longtitude;
	}

	@Override
	public void setLongitude(double n) {
		// TODO Auto-generated method stub

		this.longtitude = n;

	}

	@Override
	public void setLatitude(double n) {
		// TODO Auto-generated method stub

		this.latitude = n;

	}

	@Override
	public double getLongitude() {
		// TODO Auto-generated method stub
		return this.longtitude;
	}

	@Override
	public double getLatitude() {
		// TODO Auto-generated method stub
		return this.latitude;
	}

	@Override
	public String toString() {
		return "[" + this.longtitude + "," + this.latitude + "]";
	}

}
