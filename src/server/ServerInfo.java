package server;

import java.io.Serializable;

/**
 * This class contains all server information
 * 
 * @author Bing Li
 *
 */
public class ServerInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final double version_number = 0.1; // version number
	public static final int server_port_number = 55667; // server port #
	public static final int client_port_number = 45668;
	

}
