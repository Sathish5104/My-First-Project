package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdatinData extends BaseClass {
	public static void main(String[] args) throws Throwable {

		browserlaunch();
		getUrl("https://adactinhotelapp.com/");

		implcityWait(3000);
		WebElement login = driver.findElement(By.id("username"));
		sendKeys(login, readFromExcel("store", 0, 1));

		WebElement pass = driver.findElement(By.id("password"));
		sendKeys(pass, readFromExcel("store", 1, 1));
		WebElement con = driver.findElement(By.id("login"));
		btnClick(con);

		WebElement lct = driver.findElement(By.xpath("//select[@name='location']"));
		selectByVisibleText(lct, "New York");
		
		WebElement htl = driver.findElement(By.id("hotels"));
		selectByvalue(htl, "Hotel Hervey");
		
		WebElement room = driver.findElement(By.id("room_type"));
		selectByvalue(room,"Double");	
		
		WebElement noroom = driver.findElement(By.id("room_nos"));
		selectByindex(noroom, 3);
		
		WebElement datein = driver.findElement(By.id("datepick_in"));
		sendKeys(datein, readFromExcel("store", 2, 1));
		
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		sendKeys(dateout, readFromExcel("store", 4, 1));
		
		WebElement adl = driver.findElement(By.id("adult_room"));
		selectByindex(adl, 1);
		
		WebElement child = driver.findElement(By.id("adult_room"));
		selectByindex(child, 1);
		
		WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));
		btnClick(click);
		 
		Thread.sleep(1000);
		WebElement ok = driver.findElement(By.id("radiobutton_0"));
		btnClick(ok);
		
		WebElement con1 = driver.findElement(By.id("continue"));
		btnClick(con1);
		
		WebElement name = driver.findElement(By.id("first_name"));
		sendKeys(name, readFromExcel("store", 3, 1));
		
		WebElement last = driver.findElement(By.id("last_name"));
		sendKeys(last, readFromExcel("store", 5, 1));
		
		WebElement add = driver.findElement(By.id("address"));
		sendKeys(add, readFromExcel("store", 6, 1));
		WebElement ccno = driver.findElement(By.id("cc_num"));
		sendKeys(ccno, readFromExcel("store", 7	, 1));
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		sendKeys(cvv,readFromExcel("store", 8, 1));
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		selectByVisibleText(cardtype, "Master Card");
		
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		selectByindex(month, 5);
		
		WebElement expy = driver.findElement(By.id("cc_exp_year"));
		selectByindex(expy, 5);
		
		WebElement bk = driver.findElement(By.id("book_now"));
		btnClick(bk);
		
		WebElement scrl = driver.findElement(By.id("gst"));
	//	scrollDown(scrl);
		
		WebElement orderno = driver.findElement(By.id("order_no"));
		
	String roomId = orderno.getAttribute("value");
	
	System.out.println(roomId);
	
	insertIntoExcel("Store", 10, 1, roomId);
		
		
		
		
		
		
	}
}
