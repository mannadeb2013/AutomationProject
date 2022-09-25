package com.smarttechqa.basepage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookSignUp {
	
	public static void signUp() {
		
		System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\manna\\eclipse-workspace\\Techshop_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("pass")).sendKeys("");
				
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/"
				+ "form/div/div/div/div[2]/span/span/input")).click();
		
	}
	
	public static void main(String[] args) {
		 facebookSignUp.signUp();
	}

}
