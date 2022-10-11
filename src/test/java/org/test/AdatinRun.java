package org.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdatinRun extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserlaunch();
		getUrl("https://adactinhotelapp.com/");

		AdatinPOM a = new AdatinPOM();

		WebElement email = a.getEmail();
		sendKeys(email, "ROBERTSATHISH");

		WebElement pass = a.getPass();
		sendKeys(pass, "Blaster@635164");

		WebElement lgn = a.getLgn();
		btnClick(lgn);

		driver.navigate().refresh();
		WebElement lct = a.getSelectLct();
		selectByvalue(lct, "London");

		WebElement htl = a.getSelecthotels();
		selectByvalue(htl, "Hotel Hervey");

		WebElement room = a.getRoomty();
		selectByvalue(room, "Double");

		WebElement roomno = a.getRoomno();
		selectByindex(roomno, 2);

		WebElement dtin = a.getDtin();
		sendKeys(dtin, "10/10/2022");

		WebElement dtout = a.getDtout();
		sendKeys(dtout, "15/10/2022");

		WebElement adroom = a.getAdroom();
		selectByindex(adroom, 2);

		WebElement chdroom = a.getChdroom();
		selectByindex(chdroom, 2);

		WebElement search = a.getSearch();
		btnClick(search);

		implcityWait(5000);
		WebElement option = a.getOption();
		btnClick(option);

		WebElement contin = a.getContin();
		btnClick(contin);

		WebElement frst = a.getfName();
		sendKeys(frst, "qwertyuiop");

		WebElement lt = a.getlNAme();
		sendKeys(lt, "zxcvbnm,");

		WebElement addres = a.getAddres();
		sendKeys(addres, "jfiwhfiwhf");

		WebElement ccNo = a.getCcNo();
		sendKeys(ccNo, "12345698741236589");

		WebElement cctype = a.getCctype();
		selectByVisibleText(cctype, "VISA");

		WebElement month = a.getMonth();
		selectByindex(month, 5);

		WebElement year = a.getYear();
		selectByVisibleText(year, "2021");

		WebElement ccNo2 = a.getCvno();
		sendKeys(ccNo2, "1234");

		WebElement book = a.getBook();
		book.click();

		WebElement order = a.getOrder();
		System.out.println(order);

		System.out.println(order.getAttribute("value"));

		takesnap("Pomframe", "adatin");
		driver.quit();

		
		//C:\Users\asus\eclipse-workspace\Pomframe\photo
	}
}
