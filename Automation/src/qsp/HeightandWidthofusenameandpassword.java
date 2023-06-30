package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightandWidthofusenameandpassword {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int h1=driver.findElement(By.name("username")).getSize().getHeight();
		int w1=driver.findElement(By.name("username")).getSize().getWidth();
		int w2=driver.findElement(By.name("pwd")).getSize().getWidth();

		int h2=driver.findElement(By.name("pwd")).getSize().getHeight();
		
		if(h1==h2 && w1==w2)
		{
			System.out.println("height and width of usename and password are same");
		}
		else {
			System.out.println("height and width of usename and password are not same");
			
			
		}
		driver.close();
		
		

	}

}
