package Zprayoga1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Apachii {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream abcd=new FileInputStream("./data/Book1.xlsx");
		 Workbook w = WorkbookFactory.create(abcd);
		String a = w.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(a);
		FileOutputStream foes=new FileOutputStream("./data/Book1.xlsx");
		w.write(foes);
		w.close();
	}
}
