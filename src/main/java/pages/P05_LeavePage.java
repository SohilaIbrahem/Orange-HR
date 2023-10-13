package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_LeavePage {
    WebDriver driver;

    public P05_LeavePage (WebDriver driver){
        this.driver=driver;
    }

    private final By ClickOnLeavePage =By.xpath("//a[@class=\"oxd-main-menu-item active\"]");
    private final By CheckLeavePage = By.xpath("//div[@class=\"oxd-table-filter-header\"]");
    public P05_LeavePage UserClickOnLeavePage() {
        return this;
    }
    public Boolean CheckLeavePageOpenedSuccessfully()
    {
        return driver.findElement(this.CheckLeavePage).getText().equals("Leave List");
    }
}
