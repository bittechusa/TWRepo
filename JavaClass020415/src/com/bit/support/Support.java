package com.bit.support;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Support 
{
	WebDriver dr;
	public Support(WebDriver dr)
	{
		this.dr=dr;
	}
	public void link(By by)
	{
		List<WebElement> w=dr.findElements(by);
		int s=w.size();
		System.out.println(s);
		for(WebElement s1:w)
		{
			System.out.println(s1.getText());
		}
	}
		public void getAttribute()
		{
			String s=dr.findElement(By.xpath(".//*[@id='search-submit']")).getAttribute("id");
			
		 System.out.println(s);
		}
	}


