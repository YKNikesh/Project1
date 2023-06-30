package Zprayoga1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class handlingDisabled {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/Disabled.html");
		//RemoteWebDriver abcd=(RemoteWebDriver)driver;
		driver.findElement(By.id("t1")).sendKeys("admin");
		driver.executeScript("document.getElementById('t2').value='manager'");
	}}
