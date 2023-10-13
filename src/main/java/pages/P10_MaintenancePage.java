package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P10_MaintenancePage {

    WebDriver driver;

    public P10_MaintenancePage (WebDriver driver){
        this.driver=driver;
    }
    private final By ClickOnMaintenancePage = By.xpath("");
    private final By CheckMaintenancePage = By.xpath("");

    public Boolean CheckMaintenancePageOpenedSuccessfully()
    {
        return driver.findElement(this.CheckMaintenancePage).isDisplayed();
    }
}
