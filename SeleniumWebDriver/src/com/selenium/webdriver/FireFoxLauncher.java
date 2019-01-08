package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLauncher {

	public static void main(String[] args) {
		
		//launch FireFox browser by using geckodriver.exe
		System.setProperty("webdriver.gecko.driver", "E:\\selenium-jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		//Validation point
		if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Exclusive Offers!")) {
			System.out.println("Expected title");
		}
		else
			System.out.println("Unexpected Title"+title);
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getWindowHandle());
		driver.quit();//browser will close automatically
	}//main

}//class
