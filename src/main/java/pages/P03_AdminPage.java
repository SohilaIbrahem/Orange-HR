package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_AdminPage {
    WebDriver driver;

    public P03_AdminPage (WebDriver driver){
        this.driver=driver;
    }
    private final By ClickOnAdmin = By.xpath("a[@class=\"oxd-main-menu-item active\"");
    private final By CheckAdminPage = By.xpath("//div[@class=\"oxd-table-filter-header-title\"]");

    public P03_AdminPage UserClickOnAdmin() {
        driver.findElement(this.ClickOnAdmin).click();
        return this;
    }
    public Boolean CheckAdminPageOpenedSuccessfully()
    {

        return driver.findElement(this.CheckAdminPage).getText().equals("System Users");
    }

}
