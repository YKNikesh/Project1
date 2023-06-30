package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxActitime {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean logo=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		if(logo==true)
		{
			System.out.println("checkbox is selelcted and pass ");
			
		}
		else
		{
			System.out.println("checkbox is not selected and fail ");
		}
		driver.close();

	}

}
