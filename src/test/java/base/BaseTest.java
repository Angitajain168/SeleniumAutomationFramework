package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver; // driver instance


    @BeforeMethod
    public void setup() throws Exception {

        // Start browser
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        // Navigate to URL
        driver.get("https://www.amazon.in/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
