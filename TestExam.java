package com.Testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExam {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CDAC\\Desktop\\JAR\\chromedriver-win64\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		
		System.out.println(d.getCurrentUrl());  //guru website  url

		d.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	
		d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("vikesh");
		d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("kumar");
		d.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("121213212");
		d.findElement(By.xpath("//input[@id='userName']")).sendKeys("vikesh@gmail.com");
		d.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("jaipur");
		d.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("jaipur");
		d.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("rajasthan");
		d.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("412211");

		Select dropDown = new Select(d.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));
		dropDown.selectByVisibleText("INDIA");

		d.findElement(By.xpath("//input[@id='email']")).sendKeys("vikesh");
		d.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("vikesh123");
		d.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("vikesh123");
		d.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();
		
		d.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();



		d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("vikesh");
		d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("vikesh123");
		Thread.sleep(3000);
	
		 WebElement element = d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		 System.out.println(element.getAttribute("value"));
		 WebElement element1 =  d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
		  System.out.println(element1.getAttribute("value"));

		d.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();
	
		
		
		 
		

	}
}
