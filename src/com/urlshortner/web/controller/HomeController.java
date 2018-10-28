package com.urlshortner.web.controller;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Redirect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.urlshortner.web.entity.UrlRecord;
import com.urlshortner.web.service.UrlService;

@Controller
public class HomeController {
	
	@Autowired
	private UrlService urlService;
	
	@RequestMapping("/")
	public String homePage(Model theModel)	{
		
		UrlRecord theUrlProcessor = new UrlRecord();
		theModel.addAttribute("urlProcess", theUrlProcessor);
		
		return "url-shortner";
	}

	
	@PostMapping("/short-url")
	public String processURL(@ModelAttribute("urlProcess") UrlRecord theUrlProcessor, Model theModel)	{

		
		Integer primeId = urlService.saveUrl(theUrlProcessor);
		
		if (primeId == -1) {
			return "invalid-url";
		} else {
			theModel.addAttribute("id", primeId);				
			return "shorted-url";
		}
	}
	
	
	@GetMapping(value = "/{id}")
	public ModelAndView processURL(@PathVariable String id, Model theModel)	{
		
		System.out.println("Insede Home URL");
		
		System.out.println(id);
		
		String url = urlService.getUrl(id);
		System.out.println("Home " + url);
		
		if(url!="false")
			return new ModelAndView("redirect:" + url);
		else
			return new ModelAndView("forward:not-valid");
					
		//theModel.addAttribute("finalUrl", url);

//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl(url);	
		
	}
	
	@GetMapping("/not-valid")
	public String invalidUrl(Model theModel)	{
		
		return "not-valid";

	}
	
}
