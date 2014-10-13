package database.data;

import java.util.LinkedList;

import database.interfaces.PersonStatus;
/**
 * This is the instance of PersonStatus List
 * @author Bing Li
 *
 */
public class UserStatusList extends LinkedList<PersonStatus> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserStatusList ul = new UserStatusList();
		
		ul.add(new UserStatus(new UserInfo(2222, "Long", "Ma"), new Location(222,
				222), 222));
		ul.add(new UserStatus(new UserInfo(2222, "Long", "Ma"), new Location(222,
				222), 2223));
		ul.add(new UserStatus(new UserInfo(2222, "Long", "Ma"), new Location(222,
				222), 2224));
		
		for(PersonStatus ps:ul){
			System.out.println(ps.toString());
		}
	}

}
