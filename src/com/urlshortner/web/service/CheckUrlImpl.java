package com.urlshortner.web.service;

import java.net.URL;
import org.springframework.stereotype.Component;

import com.urlshortner.web.entity.UrlRecord;

@Component
public class CheckUrlImpl implements CheckUrl {

	@Override
	public boolean urlValidity(UrlRecord url) {
		
		try {
			new URL(url.getRecords()).toURI();
			return true;
		} catch (Exception e) {
			System.out.println("Not a valid URL");
			return false;
		}		
	}
}
