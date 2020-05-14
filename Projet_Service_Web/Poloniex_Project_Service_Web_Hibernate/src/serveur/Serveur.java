package serveur;

import service.*;
import javax.xml.ws.Endpoint;;
public class Serveur {
	public static final String SERVER ="http://localhost:";
	public static final String PORT ="1212/";

	public static void main(String[] args) {
		try {
			Endpoint.publish(SERVER+PORT, new Poloniex());

			System.err.println("=====================================");
			System.err.println("=======Server starting OK !=======");
		}
		catch(Exception e) {
			System.err.println("probleme starting server"+ e.getMessage());
		}
	}
}
