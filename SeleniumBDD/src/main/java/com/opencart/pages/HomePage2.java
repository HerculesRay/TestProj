package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage2 {

	WebDriver driver;
	By searchfor = By.name("search");
	By searchclick = By.xpath("//button/i[@class='fa fa-search']");
	By seeCart = By.xpath("//div[@id='cart']//i[@class='fa fa-shopping-cart']");
	private String searchingfor;
	


	public String getSearchingfor() {
		return searchingfor;
	}

	public void setSearchingfor(String searchingfor) {
		this.searchingfor = searchingfor;
	}

	public HomePage2(WebDriver driver){
		this.driver = driver;
	}
	
	public void setSearchfor(String searchingfor) {
		driver.findElement(searchfor).clear();
		driver.findElement(searchfor).sendKeys(searchingfor);
		driver.findElement(searchclick).click();
	}

	public void SeeCart() {
		driver.findElement(seeCart).click();
	}
	
}
