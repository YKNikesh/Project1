package Zprayoga1;



import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MTR {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/OneDrive/Desktop/PRGM%20HTML/MTRbr.html");
		  WebElement mtr = driver.findElement(By.id("mtr"));
		  Select  s=new Select(mtr);
		  List<WebElement> g = s.getOptions();
		  
		  ListIterator<WebElement> abcd = g.listIterator();
		  System.out.println(abcd);
		  
		  while(abcd.hasNext()) {
			  WebElement NB = abcd.next();
			  String TC = NB.getText();
			  s.selectByVisibleText(TC);
		  }
		   
		  abcd=g.listIterator(g.size());
		  System.out.println(abcd);
		  
		   
		   while(abcd.hasPrevious()) {
			  WebElement b = abcd.previous();
			  String c =b.getText();
			  s.deselectByVisibleText(c);
		   }}}