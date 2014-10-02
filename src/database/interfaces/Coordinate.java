package database.interfaces;

/**
 * This object contain coordinate information
 * 
 * @author Bing Li
 *
 */

public interface Coordinate {

	/**
	 * set longitude
	 * 
	 * @param n
	 *            a double number contains longitude information
	 */
	public abstract void setLongitude(double n);

	/**
	 * set latitude
	 * 
	 * @param n
	 *            a double number contains latitude information
	 */
	public abstract void setLatitude(double n);

	/**
	 * retrieve longitude
	 * 
	 * @return a double number contains longitude information
	 */
	public abstract double getLongitude();

	/**
	 * retrieve latitude
	 * 
	 * @return a double number contains latitude information
	 */
	public abstract double getLatitude();

}
