package com.datadriven;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	private static final OutputType<Object> OutputType_FILE = null;
	public static WebDriver driver;
	public static Actions a;
	public static Alert al;
	public static Robot r;
	public static TakesScreenshot ts;
	public static JavascriptExecutor js;
	public static Select s;
	private static FluentWait<WebElement> WebElement;

	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void getUrl(String website) {
		driver.get(website);
	}

	public static void pageCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void senKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void getAttribute(WebElement element, String name) {
		element.getAttribute(name);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void moveCourser(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();
	}

	public static void dragandDrop(WebElement source, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

	public static void contextClick(WebElement elem) {
		a.contextClick(elem).perform();
	}

	public static void doubleClick(WebElement elem) {
		a.doubleClick(elem).perform();
	}

	public static void keyPress() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void control() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void copy() {
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void paste() {
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
	}

	public static void takesnap(String Folder, String name) throws IOException {

		ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\asus\\eclipse-workspace\\" + Folder + "\\photo" + name + ".png");
		FileUtils.copyFile(src, dest);
	}

	public static void scrollDown(WebElement elem) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview(false)", elem);
	}

	public static void scrollUp(WebElement elem) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview(true)", elem);
	}

	public static void setAttribute(String sndvalue, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('+value+','+sndvalue+')", element);
	}

	public static void getAttribute(String value, WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("return arguments[0].getAttribute('+value'+)", element);
	}

	public static void jsclick(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arugement[0].click()", element);
	}

	public static void accept() {
		al = driver.switchTo().alert();
		al.accept();
	}

	public static void dismiss() {
		al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void passValue(String value) {
		al = driver.switchTo().alert();
		al.sendKeys(value);
	}

	public static void frameId(String id) {
		driver.switchTo().frame(id);
	}

	public static void frameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void frameindex(int index) {
		driver.switchTo().frame(index);
	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void defaultFrame() {
		driver.switchTo().defaultContent();
	}

	public static void switchwindow() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String s : child) {
			if ((s != parent)) {
				driver.switchTo().window(s);
			}
		}
	}

	public static void selectByindex(WebElement element, int num) {
		Select s = new Select(element);
		s.selectByIndex(num);
	}

	public static void selectByvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void deselectByindex(WebElement element, int num) {
		Select s = new Select(element);
		s.deselectByIndex(num);
	}

	public static void deselectByvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void deselectByindex(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void sleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}

	public static void implcityWait(int sec) {
		driver.manage().timeouts().implicitlyWait((sec), TimeUnit.SECONDS);
	}

	public static void webdriverWait(int sec) {
//			WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));
	}

	public static void fluentWait(int sec) {
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(sec));
	}

	public static void wt(int sec) {
		// TODO Auto-generated method stub
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public static String readFromExcel(String sheetname, int partRow, int i) throws Throwable{

		File f = new File("C:\\Users\\asus\\eclipse-workspace\\Pomframe\\Excel\\WriteTesting.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);
		Sheet s = w.getSheet(sheetname);
		Row r = s.getRow(partRow);
		Cell c = r.getCell(i);

		int eachcell = c.getCellType();
		String value = "";
		if (eachcell == 1) {
			value = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)) {
			Date dt = c.getDateCellValue();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			value = sdf.format(dt);
		}

		else {
			double num = c.getNumericCellValue();
			long l = (long) num;
			value = String.valueOf(l);
		}
		return value;
	}

}
