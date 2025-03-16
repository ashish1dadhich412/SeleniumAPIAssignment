package elevateprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		WebElement usernamefield = driver.findElement(By.id("username")) ;
		usernamefield.sendKeys("tomsmith");
		
		WebElement passwordfield = driver.findElement(By.id("password"));
		passwordfield.sendKeys("SuperSecretPassword!");
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
