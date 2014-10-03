package database.data;

import database.interfaces.Person;

/**
 * Contains all user information
 * 
 * @author Bing Li
 *
 */
public class UserInfo implements Person {

	private final long ID;
	private String firstName = "";
	private String lastName = "";

	/**
	 * normal constructor
	 * 
	 * @param ID
	 *            a ten digit number presents user ID
	 * @param firstName
	 *            a String object presents user's first name
	 * @param lastName
	 *            a String object presents user's last name
	 */
	public UserInfo(long ID, String firstName, String lastName) {
		this(ID);
		this.firstName = firstName;
		this.lastName = lastName;

	}

	/**
	 * constructor with empty user name
	 * 
	 * @param ID
	 *            a ten digit number presents user ID
	 */
	public UserInfo(long ID) {
		this.ID = ID;
	}

	/**
	 * test constructor, user's ID will be -1
	 */
	public UserInfo() {
		this(-1);
	}

	/**
	 * this method is useless
	 */
	public void setID(long ID) {

		System.out
				.println("Don't use database.data.UserInfo.setID(), because ID is final variable!");

	}

	@Override
	public long getID() {

		return this.ID;
	}

	@Override
	public void setFirstName(String n) {
		this.firstName = n;

	}

	@Override
	public void setLastName(String n) {
		this.lastName = n;

	}

	@Override
	public String getFirstName() {

		return this.firstName;
	}

	@Override
	public String getLastName() {

		return this.lastName;
	}

	@Override
	public String toString() {
		return this.ID + " " + this.firstName + " " + this.lastName;
	}

	public static void main(String[] args) {
		UserInfo u = new UserInfo(1000,"asdf","zxcv");
		System.out.println(u);

	}

}
