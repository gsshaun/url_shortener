package com.urlshortner.web.service;

import java.util.List;

import com.urlshortner.web.entity.UrlRecord;

public interface UrlService {

	public Integer saveUrl(UrlRecord theUrlProcessor);

	public String getUrl(String id);

}
