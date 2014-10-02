package database;

import database.interfaces.Event;
import database.interfaces.Person;

/**
 * This class contain all interaction between server and database
 * 
 * @author Bing Li, Long Ma
 *
 */
public class Interfaces {

	/**
	 * generate a new user ID
	 * 
	 * @return a ten digit number
	 */
	public static long generateUserID() {
		// TODO
		return 0;
	}

	/**
	 * add a new user into database
	 * 
	 * @param p
	 *            a Person Object contain all person information
	 * @return true if successful, false otherwise
	 */
	public static boolean addUser(Person p) {
		// TODO
		return false;
	}

	/**
	 * retrieve Person object by giving ID
	 * 
	 * @param ID
	 *            the ID of user
	 * @return a Person object contains all basic user information
	 */
	public static Person getUser(long ID) {
		// TODO
		return null;
	}

	/**
	 * generate a new event ID
	 * 
	 * @return a ten digit number
	 */
	public static long generateEventID() {
		// TODO
		return 0;
	}

	/**
	 * To predict whether this is a critical event happening by giving a list of
	 * person which are heart rate speed up.
	 * 
	 * @param an
	 *            Event object contains event information
	 * @return the result of prediction
	 */
	public static boolean predict(Event e) {
		return false;
	}

	/**
	 * report the event result to database
	 * 
	 * @param e
	 *            an Event Object contains event information
	 * @param s
	 *            the result of event
	 */
	public static void report(Event e, boolean r) {
	}

	/**
	 * generate a new database
	 * 
	 * @return true if successful, false otherwise
	 */
	public static boolean createDatabase() {
		return false;
	}

}
