package com.urlshortner.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.urlshortner.web.dao.UrlDAO;
import com.urlshortner.web.entity.UrlRecord;

@Service
public class UrlServiceImpl implements UrlService {
	
	@Autowired
	private UrlDAO urlDao;
	
	@Autowired
	private CheckUrl urlImpl;

	@Override
	@Transactional
	public Integer saveUrl(UrlRecord theUrlProcessor) {
		
		Boolean value = urlImpl.urlValidity(theUrlProcessor);
		
		if(value == true)		
			return (Integer) urlDao.saveUrl(theUrlProcessor);
		else
			return new Integer(-1);
	}

	@Override
	@Transactional
	public String getUrl(String id) {
		
		System.out.println("Insede Service URL");
		
		UrlRecord url =  urlDao.getUrl(id);
		
		if(url!=null)
			return url.getRecords();
		
		else return "false";

	}
	
	

}
