package testcases;

import drivers.DriverFactory;
import listener.Listener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.setDriver;
@Listeners(listener.Listener.class)
public class TestBase {

    protected WebDriver driver;

    @Parameters("browser")
    @BeforeTest()

    public void setupChromeDriver(String browser) {
        driver= DriverFactory.getNewInstance(browser);
        setDriver(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterTest
    public void tearDown ()
    {

        driver.quit();
    }
}



