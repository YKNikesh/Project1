package Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}
	public static void main(String[] args) {
		WebDriver KKK=new ChromeDriver();
		KKK.get("file:///C:/Users/User/OneDrive/Desktop/DEMO.html");
		KKK.close();
		KKK.navigate().to("http://www.chrome.com");
		
	}
	

}
