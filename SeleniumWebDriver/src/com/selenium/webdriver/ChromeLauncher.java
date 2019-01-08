package com.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLauncher {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://youtube.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		//validation point
		if(title.equals("YouTube")) {
			System.out.println("Correct title::"+title);
		}
		else
			System.out.println("Wrong Correct title::"+title);
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();
		
	}//main

}//class
