package service;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import bean.CryotCurrency;

import util.HibernateUtil;


@WebService(name="Poloniex")
public class Poloniex {
	
	@WebMethod(operationName="recherche")
	public CryotCurrency getOne(@WebParam(name="Type")String designation){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<CryotCurrency> l = session.createQuery("from CryotCurrency where designation = '" + designation + "'" ).list();
		return l.get(0);
	}
	
	
}


