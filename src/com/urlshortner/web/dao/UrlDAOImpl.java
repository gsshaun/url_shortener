package com.urlshortner.web.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.urlshortner.web.entity.UrlRecord;

@Repository
public class UrlDAOImpl implements UrlDAO {
	
	
	//inject session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Integer saveUrl(UrlRecord theUrlProcessor) {
					
			//get the current hibernate session		
			Session currentSession = sessionFactory.getCurrentSession();
			
			//save the customer
			Integer urlId = (Integer) currentSession.save(theUrlProcessor);
			
			return urlId;
				
	}

	@Override
	public UrlRecord getUrl(String id) {
		
		System.out.println("Insede DAO URL");
		
		//get the current hibernate session	
		Session currentSession = sessionFactory.getCurrentSession();
		System.out.println(id);
		System.out.println("Insede DAO URL with id");
		UrlRecord url = null;
		
		try {
			//currentSession.beginTransaction();				
			url =  currentSession.get(UrlRecord.class, Integer.parseInt(id));
			
			System.out.println("OK");
			System.out.println(url.getRecords());
			
		} catch (Exception e) {
			
			return url;
		}
				
		return url;
	}


}
