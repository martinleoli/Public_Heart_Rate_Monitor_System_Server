package database.interfaces;

/**
 * This object contains user status
 * 
 * @author Bing Li
 *
 */
public interface PersonStatus {

	/**
	 * set user information
	 * 
	 * @param p
	 *            Person object contains users information
	 */
	public abstract void setPerson(Person p);

	/**
	 * retrieve user information
	 * 
	 * @return Person object contains users information
	 */
	public abstract Person getPerson();

	/**
	 * retrieve heart rate number
	 * 
	 * @return an integer number present heart rate number
	 */
	public abstract int getHeartRate();

	/**
	 * set heart rate
	 * 
	 * @param h
	 *            an Integer number present heart rate number
	 */
	public abstract void serHearRate(int h);

	/**
	 * set coordinate
	 * 
	 * @param c
	 *            an object contains coordinate information
	 */
	public abstract void setCoordinate(Coordinate c);

	/**
	 * retrieve coordinate
	 * 
	 * @return an object contains Coordinate information
	 */
	public abstract Coordinate getCoordinate();
}
