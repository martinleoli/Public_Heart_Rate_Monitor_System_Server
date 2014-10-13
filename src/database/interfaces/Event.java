package database.interfaces;

import java.io.Serializable;

public interface Event extends Serializable{
	/**
	 * set event ID
	 * 
	 * @param n
	 *            a ten digit number
	 */
	public abstract void setID(long ID);

	/**
	 * retrieve event ID
	 * 
	 * @return event ID
	 */
	public abstract long getID();

	/**
	 * add one user which heart rate speed up in this event
	 * 
	 * @param p
	 *            the Person object contain person information
	 * @return true if adding successful, false otherwise
	 */
	public abstract boolean addUser(Person p);

	/**
	 * retrieve all users which are heart up speed up in this event
	 * 
	 * @return the Iterable list of Person object
	 */
	public abstract Iterable<Person> getUsers();
}
