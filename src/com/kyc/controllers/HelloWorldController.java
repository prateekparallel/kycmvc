package com.kyc.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController {

	private String message;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Map map  = new HashMap();
		map.put("one","this is one");
		map.put("two", "this is two");
		map.put("three", "this is three");
		return new ModelAndView("welcomePage","welcomeMessage", map);
		//return new ModelAndView("redirect:DummyRedirectPage.htm");
	}

	public void setMessage(String message) {
		this.message = message;
	}

}







