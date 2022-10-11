package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AdatinPOM extends BaseClass {

public AdatinPOM(){
PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
private WebElement email;
	
	@FindAll({@FindBy(name="password"),@FindBy(id="password")})
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement lgn;
	

	@FindBy(id="location")
	private WebElement selectLct;
	

	@FindBy(id="hotels")
	private WebElement selecthotels;
	

	@FindBy(id="room_type")
	private WebElement roomty;
	

	@FindBy(id="room_nos")
	private WebElement roomno;
	

	@FindBy(id="datepick_in")
	private WebElement dtin;
	

	@FindBy(id="datepick_out")
	private WebElement dtout;
	

	@FindBy(id="adult_room")
	private WebElement adroom;
	

	@FindBy(id="child_room")
	private WebElement chdroom;
	
	@FindAll({@FindBy(id="Submit"),@FindBy(name="submit")})
	private WebElement search;
			
	
	@FindAll({@FindBy(id="radiobutton_0"),@FindBy(name="radiobutton_0")})
	private WebElement option;	

	@FindBy(id="continue")
	private WebElement contin;
	
	
	public WebElement getContin() {
		return contin;
	}
	@FindBy(id="first_name")
	private WebElement fName;
	

	@FindBy(id="last_name")
	private WebElement lNAme;
	

	@FindBy(id="address")
	private WebElement addres;
	

	@FindBy(id="cc_num")
	private WebElement ccNo;
	

	@FindBy(id="cc_type")
	private WebElement cctype;
	

	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvno;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	@FindBy(id="order_no")
	private WebElement order;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLgn() {
		return lgn;
	}

	public WebElement getSelectLct() {
		return selectLct;
	}

	public WebElement getSelecthotels() {
		return selecthotels;
	}

	public WebElement getRoomty() {
		return roomty;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDtin() {
		return dtin;
	}

	public WebElement getDtout() {
		return dtout;
	}

	public WebElement getAdroom() {
		return adroom;
	}

	public WebElement getChdroom() {
		return chdroom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getOption() {
		return option;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlNAme() {
		return lNAme;
	}

	public WebElement getAddres() {
		return addres;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvno() {
		return cvno;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getOrder() {
		return order;
	}
	
	
	
	
	
}
