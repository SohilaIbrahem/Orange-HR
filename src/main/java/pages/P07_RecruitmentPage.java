package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P07_RecruitmentPage {
    WebDriver driver;

    public P07_RecruitmentPage (WebDriver driver){
        this.driver=driver;
    }
    private final By ClickOnRecruitmentPage  = By.xpath("//a[@class=\"oxd-main-menu-item active\"]");
    private final By CheckRecruitmentPage = By.xpath("//div[@class=\"oxd-table-filter-header-title\"]");

    public Boolean CheckRecruitmentPageOpenedSuccessfully()
    {
        return driver.findElement(this.CheckRecruitmentPage).isDisplayed();
    }
}
