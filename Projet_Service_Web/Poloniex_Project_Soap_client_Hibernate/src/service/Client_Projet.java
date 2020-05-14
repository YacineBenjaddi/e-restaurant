package service;

public class Client_Projet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poloniex stub = new PoloniexService().getPoloniexPort();
		CryotCurrency c= stub.recherche("Bitcoin");
		
		System.out.println("votre choix est "+" "+c.getNum()+" " +c.getDesignation()+" "+c.getEURO()+" "+c.getUSD());
		
	}

}
