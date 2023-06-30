package handlingEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/User/OneDrive/Desktop/PRGM%20HTML/t1.html");
	for(int i=1;i<=26;i++) {
		for(int J='a';i<='z';i++) {
		if(i%2==1) {
			driver.findElement(By.id("t1")).sendKeys(J);
			
	}
		else {
	driver.findElement(By.id("t2")).sendKeys(J);
	}}

}}}
