package com.functional.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {
public static void main(String[] args) {
	//WebDriver obj2=new WebDriver();
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
}
}
