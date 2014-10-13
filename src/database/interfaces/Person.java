package database.interfaces;

import java.io.Serializable;


/**
 * this interface contains all basic user information
 * @author Bing Li
 *
 */
public interface Person extends Serializable {

	/**
	 * set user ID
	 * 
	 * @param n
	 *            a ten digit number
	 */
	public abstract void setID(long ID);

	/**
	 * retrieve user ID
	 * 
	 * @return user ID
	 */
	public abstract long getID();

	/**
	 * set user's first name
	 * 
	 * @param n
	 *            a string contain user's first name
	 */
	public abstract void setFirstName(String n);

	/**
	 * set usr's last name
	 * 
	 * @param n
	 *            a string contain user's last name
	 */
	public abstract void setLastName(String n);

	/**
	 * retrieve user's first name
	 * 
	 * @return a String Object contains user's first name
	 */
	public abstract String getFirstName();

	/**
	 * retrieve user's last name
	 * 
	 * @return a String object contains user's last name
	 */
	public abstract String getLastName();

}
