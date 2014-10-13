package database.data;

import database.interfaces.Coordinate;
import database.interfaces.Person;
import database.interfaces.PersonStatus;

/**
 * This object contain user status
 * 
 * @author Bing Li
 *
 */
public class UserStatus implements PersonStatus {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Person user;
	private Coordinate location;
	private int heartRate;

	/**
	 * Default constructor
	 * 
	 * @param user
	 *            a Person object contains user information
	 * @param location
	 *            a Coordinate object contains location information
	 * @param heartRate
	 *            an integer number presents heart rate
	 */
	public UserStatus(Person user, Coordinate location, int heartRate) {

		this.user = user;
		this.location = location;
		this.heartRate = heartRate;
	}

	@Override
	public void setPerson(Person p) {
		// TODO Auto-generated method stub

		this.user = p;

	}

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return this.user;
	}

	@Override
	public int getHeartRate() {
		// TODO Auto-generated method stub
		return this.heartRate;
	}

	@Override
	public void serHearRate(int h) {
		// TODO Auto-generated method stub

		this.heartRate = h;

	}

	@Override
	public void setCoordinate(Coordinate c) {
		// TODO Auto-generated method stub

		this.location = c;

	}

	@Override
	public Coordinate getCoordinate() {
		// TODO Auto-generated method stub
		return this.location;
	}

	@Override
	public String toString() {
		String s = "";
		s += this.user + "\n";
		s += "Heart Rate: " + this.heartRate + "\n";
		s += this.location;
		return s;
	}

	public static void main(String[] args) {
		UserInfo u = new UserInfo(222222, "Long", "Ma");
		Location l = new Location(22, 22);
		UserStatus us = new UserStatus(u, l, 222);
		System.out.println(us);
	}

}
