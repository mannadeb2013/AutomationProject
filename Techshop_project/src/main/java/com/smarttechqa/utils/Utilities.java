package com.smarttechqa.utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.google.common.io.Files;
import com.smarttechqa.basepage.baseClassJava;

public class Utilities extends baseClassJava{
	
	public static WebElement getExplicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement elem =wait.until(ExpectedConditions.elementToBeClickable(element));
		return elem;
	}
	public static void actionClick(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}
	public static void jsClick(WebElement element) {
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
	public static void elementScroll(WebElement element) {
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView", element);
	}
	public static void scrollToBottompage(WebElement element) {
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("window.scrollTo(0,0)");
		
	}
	public static void takeScreenShot() {
		File src
	}
		
	}


