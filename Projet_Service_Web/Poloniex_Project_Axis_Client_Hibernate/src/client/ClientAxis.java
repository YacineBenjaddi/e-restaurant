package client;

import java.rmi.RemoteException;

import service.CryotCurrency;
import service.PoloniexProxy;

public class ClientAxis {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		PoloniexProxy proxy =new PoloniexProxy();
	
		
		CryotCurrency c = proxy.recherche("Ripple");
		
		System.out.println("votre choix est : " +c.getNum()+" "+c.getDesignation()+" "+c.getEURO()+" "+c.getUSD());
		
		

	}

}
