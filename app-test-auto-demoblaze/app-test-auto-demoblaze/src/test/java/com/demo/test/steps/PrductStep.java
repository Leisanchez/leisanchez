package com.demo.test.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PrductStep extends PageObject{
	
	@FindBy(id = "signin2")
	protected WebElementFacade optSignUp;
	
	@FindBy(id = "name")
	protected WebElementFacade name;
	
	@FindBy(id = "country")
	protected WebElementFacade country;
	
	@FindBy(id = "city")
	protected WebElementFacade city;
	
	@FindBy(id = "card")
	protected WebElementFacade card;
	
	@FindBy(id = "year")
	protected WebElementFacade year;
	
	@FindBy(id = "month")
	protected WebElementFacade month;
	
	@FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	protected WebElementFacade btnPurschase;
	
	@FindBy(xpath = "/html/body/div[10]")
	public WebElementFacade msgPurshaceOk;
	
	public String getTextAlert() throws InterruptedException {
		Thread.sleep(2000);
		return this.getDriver().switchTo().alert().getText();
	}
	
	public void alertToOk() {
		this.getDriver().switchTo().alert().accept();
	}
	
	public WebElement getElementByXpath(String xpath) {
		WebElement weElement = this.getDriver().findElement(By.xpath(xpath));
		this.setWaitForTimeout(4000);
		return weElement;
	}

}
