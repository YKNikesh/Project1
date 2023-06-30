package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forgotyourpassword {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String logo = driver.findElement(By.xpath("//a[@onclick=\"pageController.changeState(LOGIN_PAGE_STATES[FORGET_PASSWORD_STATE])\"]")).getTagName();
  System.out.println(logo);
	}

}
