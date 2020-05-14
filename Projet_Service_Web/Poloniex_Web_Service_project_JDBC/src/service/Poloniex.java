package service;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import bean.CryotCurrency;
import util.Connec;


@WebService(name="Poloniex")
public class Poloniex {
	 @WebMethod(operationName="ech")
	public CryotCurrency CurrencyExchangeRate(@WebParam(name="type")String des) {
		CryotCurrency c=null;
	
		String req="Select * from bit where designation='"+des+"' ";
		System.out.println(req);
		Connection cnx = Connec.getConnection();
		try {
		Statement stm=cnx.createStatement();
		ResultSet rs=stm.executeQuery(req);
		rs.next();
		int num=rs.getInt(1);
		String desg=rs.getString(2);
		double euro=rs.getDouble(3);
		double usd=rs.getDouble(4);
		c=new CryotCurrency(num,desg,euro,usd);
		
		}
		catch(Exception e) {
			System.err.println("probleme dans methode jdbc"+ e.getMessage());
		}
		return c;
		
	}
	 
	 
	 public boolean Ajouter(String value,double e,double u ) {
		 
		 boolean resultat=false;
			String req="INSERT INTO bit "+"values(null,'"+value+"',"+e+","+u+") ";
			System.out.println(req);
			Connection cnx = Connec.getConnection();
			try {
			Statement stm=cnx.createStatement();
			int etat=stm.executeUpdate(req);
			
			if(etat==1) {
				resultat=true;
			}
			
			}
			catch(Exception e1) {
				System.err.println("probleme dans methode jdbc"+ e1.getMessage());
			}
			return resultat;
		 
	 }
	 
	 
}
