package client;

import java.util.List;

import service.CryotCurrency;
import service.Poloniex;
import service.PoloniexService;



public class Client_Poloniex {
	
	public static void main(String args[]) {
		//jax ws
		
		Poloniex stub = new PoloniexService().getPoloniexPort();
		CryotCurrency c= stub.ech("Bitcoin");
		
		System.out.println("votre choix est "+" "+c.getNum()+" "+c.getDesignation()+" "+c.getEURO()+" "+c.getUSD());
		
}
}
