package database.data;

import database.interfaces.Event;
import database.interfaces.Person;
/**
 * Contains all event information
 * @author Bing Li
 *
 */
public class EventInfo implements Event {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long ID;
	private UserList users;

	/**
	 * Default constructor
	 */
	public EventInfo() {
		this(1l);

	}

	/**
	 * Constructor
	 * 
	 * @param ID
	 *            a long number represent even ID
	 */
	public EventInfo(long ID) {
		this.ID = ID;
		this.users = new UserList();
	}

	@Override
	public void setID(long ID) {
		this.ID = ID;

	}

	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}

	@Override
	public boolean addUser(Person p) {

		return this.users.add(p);
	}

	@Override
	public Iterable<Person> getUsers() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
