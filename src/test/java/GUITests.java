import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class GUITests {

    @Test
    public void openGooglePageTest() throws InterruptedException {
        DriverManagerType driverManagerType = DriverManagerType.CHROME;
        WebDriverManager.getInstance(driverManagerType).setup();

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://yandex.ru");

        driver.findElement(By.name("text")).sendKeys("TeachMeSkills" + Keys.ENTER);
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[.='teachmeskills.by']")).isDisplayed());

        driver.quit();
    }
}
