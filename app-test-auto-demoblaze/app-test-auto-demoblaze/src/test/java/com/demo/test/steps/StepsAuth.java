package com.demo.test.steps;

import net.serenitybdd.core.pages.ClickStrategy;
import net.thucydides.core.annotations.Step;

public class StepsAuth extends LoginStep{
	
	@Step("Abrir popup auth")
	public void openLogin() {
		this.optLogin.click();
	}
	
	@Step("Abrir popup")
	public void openSignUp() {
		this.optSignUp.click();
	}
	
	@Step("Ingresa usuario")
	public void setUserName(String username) {
		this.username.sendKeys(username);
	}
	
	@Step("Ingresa password")
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	@Step("Ingresa usuario login")
	public void setLoginUserName(String username) {
		this.loginusername.sendKeys(username);
	}
	
	@Step("Ingresa password login")
	public void setLoginPassword(String password) {
		this.loginpassword.sendKeys(password);
	}
	
	@Step("Registrar usuario")
	public void clickBtn() {
		this.btnSign.click();
	}
	
	@Step("Realizar logIn")
	public void clickBtnLogIn() {
		this.btnLogIn.click(ClickStrategy.WAIT_UNTIL_PRESENT);
	}

}
