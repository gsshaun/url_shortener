package com.urlshortner.web.dao;

import java.util.List;

import com.urlshortner.web.entity.UrlRecord;

public interface UrlDAO {

	public Integer saveUrl(UrlRecord theUrlProcessor);

	public UrlRecord getUrl(String id);
	
}
