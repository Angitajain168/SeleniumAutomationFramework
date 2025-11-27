package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Log;

public class BaseTest {

    protected WebDriver driver; // driver instance


    @BeforeMethod
    public void setup() throws Exception {
    	Log.info("Starting WebDriver");
        // Start browser
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        // Navigate to URL
    	Log.info("Navigate to URL");
        driver.get("https://www.amazon.in/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
        	Log.info("Closing Browser");
            driver.quit();
        }
    }
}
