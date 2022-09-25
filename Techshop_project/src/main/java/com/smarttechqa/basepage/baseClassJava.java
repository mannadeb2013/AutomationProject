package com.smarttechqa.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClassJava {
	
	public static void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.smarttechqa.com/login");
		driver.findElement(By.id("email")).sendKeys("oshikitto123@email.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("manna");
		driver.findElement(By.n)
		//driver.findElement(By.id("password")).sendKeys("manna");
		//driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/form/button")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println(driver.getTitle());
		
	}
	public static void main(String[] args) {
		baseClassJava.setup();
		
	}

}
