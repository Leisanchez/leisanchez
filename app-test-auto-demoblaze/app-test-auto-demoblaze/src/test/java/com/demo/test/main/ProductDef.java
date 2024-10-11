package com.demo.test.main;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Sleeper;

import com.demo.test.steps.BuyStepsProduct;
import com.demo.test.steps.StepsAuth;
import com.demo.test.utils.WebSite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class ProductDef {
	
	@Steps(shared = true)
	WebSite url;
	
	@Steps(shared = true)
	StepsAuth login;
	
	@Steps(shared = true)
	BuyStepsProduct buyProduct;
	
	@Given("El usuario realiza la compra efectiva")
	public void goToUrl() {
		url.goToUrlString("https://www.demoblaze.com/");
	}
	
	@When("selecciona la categoria telefono y la marca")
	public void userAuth() throws InterruptedException {
		login.openLogin();
		login.setLoginUserName("spruebatres");
		login.setLoginPassword("456789");
		login.clickBtnLogIn();
		Thread.sleep(2000);
		buyProduct.selElement("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a").click();
		Thread.sleep(2000);
		buyProduct.selElement("//*[@id=\"tbodyid\"]/div[2]/div/a").click();
	}
	
	@Then("lo agrega al cart y genera la orden de compra")
	public void completePurchase() throws InterruptedException {
		
		String txtAlert = buyProduct.getTextAlert();
		
		if(txtAlert.equals("Product added.")) {
			buyProduct.alertToOk();
			buyProduct.selElement("//*[@id=\"navbarExample\"]/ul/li[4]/a").click();
			buyProduct.selElement("//*[@id=\"page-wrapper\"]/div/div[2]/button").click();
			buyProduct.setName("Prueba compra");
			buyProduct.setCountry("Colombia");
			buyProduct.setCreditCard("123456");
			buyProduct.setMonth("07");
			buyProduct.setYear("2024");
			buyProduct.clickBtn();
			Assert.assertTrue(buyProduct.msgPurscjaseOk());
		}else {
			Assert.assertTrue(false);
		}
		
	}

}
