package com.urlshortner.web.service;

import com.urlshortner.web.entity.UrlRecord;

public interface CheckUrl {
	
	boolean urlValidity(UrlRecord url);

}
