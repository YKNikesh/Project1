package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver1=new ChromeDriver();
		driver1.navigate().to("http://www.chrome.com");
		driver1.get("https://www.instagram.com/");
		driver1.navigate().back();
		driver1.navigate().refresh();
		driver1.navigate().forward();
		driver1.close();
		WebDriver driver2=new ChromeDriver();
		driver2.navigate().to("http://www.chrome.com");
		driver2.get("https://www.instagram.com/");
		driver2.findElement(By.name("username")).click();
	}

}
