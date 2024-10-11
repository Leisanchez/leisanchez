package com.demo.test.utils;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {
	
	@Steps(shared = true)
	PageObject page;
	
	@Step("Abrir sitio")
	public void goToUrlString(String url) {
		page.setDefaultBaseUrl(url);
		page.open();
		
	}

}
