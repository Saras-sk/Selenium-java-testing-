package com.selenium.demo.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
        WebElement Unm = driver.findElement(By.id("email"));
        Unm.sendKeys("nanosingh17896@gmail.com");
        
        driver.findElement(By.name("pass")).sendKeys("satyamavejayate");
        
        driver.findElement(By.name("login")).click();
        
        
        

	}

}
