package com.selenium.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("back done..");
		Thread.sleep(1000);
		
		driver.navigate().forward();
		System.out.println("forward done");
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		System.out.println("refresh done..");
		
		
		
	}
	}