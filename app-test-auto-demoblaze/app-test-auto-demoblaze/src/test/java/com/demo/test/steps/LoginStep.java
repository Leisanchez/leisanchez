package com.demo.test.steps;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginStep extends PageObject{
	
	@FindBy(id = "login2")
	protected WebElementFacade optLogin;
	
	@FindBy(id = "signin2")
	protected WebElementFacade optSignUp;
	
	@FindBy(id = "sign-username")
	protected WebElementFacade username;
	
	@FindBy(id = "loginusername")
	protected WebElementFacade loginusername;
	
	@FindBy(id = "loginpassword")
	protected WebElementFacade loginpassword;
	
	@FindBy(id = "sign-password")
	protected WebElementFacade password;
	
	@FindBy(xpath = "//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
	protected WebElementFacade btnSign;
	
	@FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	protected WebElementFacade btnLogIn;
	
	public String getTextAlert() {
		return this.getDriver().switchTo().alert().getText();
	}

}
