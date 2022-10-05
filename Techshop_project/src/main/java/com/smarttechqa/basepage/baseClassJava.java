package com.smarttechqa.basepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClassJava {
	public static WebDriver driver;
	public static void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.get("https://www.smarttechqa.com/login");
		driver.findElement(By.id("email")).sendKeys("oshikitto123@email.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("manna");
		//driver.findElement(By.n)
		//driver.findElement(By.id("password")).sendKeys("manna");
		//driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/form/button")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		
	}
	public static void main(String[] args) {
		baseClassJava.setup();
		
	}

}
