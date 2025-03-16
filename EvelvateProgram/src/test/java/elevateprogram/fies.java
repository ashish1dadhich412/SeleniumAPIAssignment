package elevateprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fies {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("file-upload")));

        // Upload File
        fileInput.sendKeys("C:\\Users\\LENOVO\\Downloads\\Ashish Dadheech main 4.pdf");

        // Wait for the Upload Button
        WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("file-submit")));
        uploadButton.click();

        // Delay for observation
        Thread.sleep(5000);

        // Close Browser
        driver.quit();
    }
}
