package elevateprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndFileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
		String filePath= "C:\\Users\\LENOVO\\Downloads\\Assignment1.pdf";
		        fileInput.sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();
        	
        WebElement successMessage = driver.findElement(By.tagName("h3"));
        System.out.println("Success Message: " + successMessage.getText());

        WebElement uploadedFileName = driver.findElement(By.id("uploaded-files"));
        System.out.println("Uploaded File: " + uploadedFileName.getText());
        
        
        driver.quit();
       
        
        


        
		

	}

}
