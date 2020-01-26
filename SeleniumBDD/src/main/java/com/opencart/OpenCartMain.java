package com.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencart.pages.HomePage;

public class OpenCartMain {
	
	private static void toHomePage(WebDriver driver) throws Exception {
		HomePage h1 = new HomePage(driver);
		h1.setSearchingfor("iPlhone");
		h1.setSearchfor(h1.getSearchingfor());
		
		//h1.SeeCart();
		Thread.sleep(4000);
	}
	private static void closeWindow(WebDriver driver) {
		driver.close();
	}
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String applicationURL = "https://demo.opencart.com/";
		
		driver.get(applicationURL);
		driver.manage().window().maximize();
		toHomePage(driver);
		closeWindow(driver);
		System.out.println("Execution Over");
		
		}



}
