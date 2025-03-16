package elevateprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream(new File("C:\\Users\\rohya\\eclipse-workspace\\selenium\\src\\test\\resources\\Data\\Loginusername.xlsx"));
		
		Workbook book =  WorkbookFactory.create(file);
		
		String Username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		String Password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys(Username);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(Password);
		
		
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		SubmitBtn.click();
		
		
		System.out.println("Login Successful...");
		driver.quit();
	}

}
