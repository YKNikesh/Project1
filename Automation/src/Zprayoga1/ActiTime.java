package Zprayoga1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String logo;
		String text =
		logo=driver.findElement(By.xpath("//b[1]")).getText();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(logo);
		System.out.println(text);
		String abcd;
		String abcd2=
		abcd=driver.findElement(By.xpath("(//td)[10]/b")).getText();
		System.out.println(abcd2);
		}
	}