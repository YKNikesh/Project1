package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrefofActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		 String logo=driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getAttribute("href");
		 System.out.println(logo);
		 driver.close();
		
		

	}

}
