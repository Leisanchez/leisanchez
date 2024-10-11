package com.demo.test.main;

import com.demo.test.steps.StepsAuth;
import com.demo.test.utils.WebSite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import net.thucydides.core.annotations.Steps;

public class LoginDef {
	
	@Steps(shared = true)
	WebSite url;
	
	@Steps(shared = true)
	StepsAuth login;
	
	@Given("El usuario navega al sitio")
	public void goToUrl() {
		url.goToUrlString("https://www.demoblaze.com/");
	}
	
	@When("ingresa un usuario nuevo en la opción sign up")
	public void userAuth() {
		login.openSignUp();
		login.setUserName("spruebatres");
		login.setPassword("456789");
		login.clickBtn();
	}
	
	@Then("la pagina muestra mensaje de creación correcto")
	public void assertAuth() {
		String alert = login.getTextAlert();
		Assert.assertEquals("No coincide", "Sign up successful.", alert);
	}

}
