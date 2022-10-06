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
		driver.findElement(By.xpath("//*[@class='gb_1 gb_2 gb_8d gb_8c']")).click();
		driver.findElement(By.xpath("(//*[@class='whsOnd zHQkBf'])[1]")).sendKeys("manna8662@gmail.com");
		driver.findElement(By.xpath("(//*[@class='VfPpkd-vQzf8d'])[2]")).click();

	}

}
