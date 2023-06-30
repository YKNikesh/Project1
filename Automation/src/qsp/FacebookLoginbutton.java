package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class FacebookLoginbutton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	 boolean logo = driver.findElement(By.name("login")).isDisplayed();
	if(logo==true) {
		System.out.println("facebook login button present and pass");
	}
	else {
		System.out.println("facebook login button not present and fail");
	}
	driver.close();
}
}
