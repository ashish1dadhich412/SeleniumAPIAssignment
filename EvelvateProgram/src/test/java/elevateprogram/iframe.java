package elevateprogram;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.openqa.selenium.io.FileHandler;

public class iframe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.switchTo().frame("SingleFrame");
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("Test Single Frame");

        File singleFrameScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(singleFrameScreenshot, new File("single_frame.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame);
        WebElement innerFrame = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(innerFrame);

        WebElement nestedInput = driver.findElement(By.tagName("input"));
        nestedInput.sendKeys("Test Nested Frame");

        File nestedFrameScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(nestedFrameScreenshot, new File("nested_frame.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.switchTo().defaultContent();
        driver.quit();
    }
}
