package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_TimePage {
    WebDriver driver;

    public P06_TimePage (WebDriver driver){
        this.driver=driver;
    }


    private final By ClickOnTimePage = By.xpath("//a[@class=\"oxd-main-menu-item active\"]");
    private final By CheckTimePage = By.xpath("//div[@class=\"orangehrm-header-container\"]");
    public P06_TimePage UserClickOnTimePage() {
        driver.findElement(this.ClickOnTimePage).click();
        return this;
    }

    public Boolean CheckAdminPageOpenedSuccessfully()
    {

        return driver.findElement(this.CheckTimePage).getText().equals("Timesheets Pending Action");
    }
}
