package com.demo.test.steps;


import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Step;

public class BuyStepsProduct extends PrductStep{
	
	@Step("Seleccionar producto")
	public WebElement selElement(String xpath) {
		return this.getElementByXpath(xpath);
	}
	
	@Step("Ingresa nombre")
	public void setName(String name) {
		this.name.sendKeys(name);
	}
	
	@Step("Ingresa pais")
	public void setCountry(String country) {
		this.country.sendKeys(country);
	}
	
	@Step("Ingresa ciudad")
	public void setCity(String city) {
		this.city.sendKeys(city);
	}
	
	@Step("Ingresa tarjeta")
	public void setCreditCard(String creditCard) {
		this.card.sendKeys(creditCard);
	}
	
	@Step("Ingresa mes")
	public void setMonth(String month) {
		this.month.sendKeys(month);
	}
	
	@Step("Ingresa anio")
	public void setYear(String year) {
		this.year.sendKeys(year);
	}
	
	@Step("Registrar compra")
	public void clickBtn() {
		this.btnPurschase.click();
	}

	
	public Boolean msgPurscjaseOk() {
		return this.msgPurshaceOk.isDisplayed();
	}
	
	
}
