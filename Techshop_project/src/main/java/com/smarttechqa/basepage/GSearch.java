package com.smarttechqa.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GSearch {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
				 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook");
		driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).click();

	}

}
