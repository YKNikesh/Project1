package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.chrome.com");		
	}
}
