package elevateprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        List<String[]> credentials = ExcelReader.readExcel("TestData.xlsx", "Sheet1");

        for (String[] cred : credentials) {
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginBtn = driver.findElement(By.id("submit"));

            username.clear();
            password.clear();
            username.sendKeys(cred[0]);
            password.sendKeys(cred[1]);
            loginBtn.click();

            if (driver.getPageSource().contains("Logged In Successfully")) {
                System.out.println("Login Successful for: " + cred[0]);
            } else {
                System.out.println("Login Failed for: " + cred[0]);
            }
            driver.navigate().back();
        }
        driver.quit();
    }
}
