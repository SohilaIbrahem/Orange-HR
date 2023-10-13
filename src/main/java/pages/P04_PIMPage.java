package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_PIMPage {
    WebDriver driver;

    public P04_PIMPage (WebDriver driver){
        this.driver=driver;
    }

    private final By ClickOnPIMPage = By.xpath("//a[@class=\"oxd-main-menu-item active\"]");
    private final By CheckPIMPage = By.xpath("//div[@class=\"oxd-table-filter-header-title\"]");


    public P04_PIMPage UserClickOnPIMPage() {
        driver.findElement(this.CheckPIMPage).click();
        return this;
    }
    public Boolean CheckCheckPIMPageOpenedSuccessfully()
    {
        return driver.findElement(this.CheckPIMPage).getText().equals("Employee Information");
    }
}
