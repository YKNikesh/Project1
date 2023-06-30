package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xandyaxisloginfaceboook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");

		int logo = driver.findElement(By.name("login")).getLocation().getX();
		int logo1 = driver.findElement(By.name("login")).getLocation().getY();
		System.out.println("x axis of login button"+ logo+"pixels");
		System.out.println("y axis of login button"+ logo1+"pixels");
		driver.close();
		
     
	}

}
