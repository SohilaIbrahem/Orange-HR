package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P08_MyInfoPage {
    WebDriver driver;

    public P08_MyInfoPage (WebDriver driver){
        this.driver=driver;
    }
    private final By ClickOnMyInfoPage = By.xpath("");
    private final By CheckMyInfoPage = By.xpath("");

    public Boolean CheckMyInfoPageOpenedSuccessfully()
    {
        return driver.findElement(this.CheckMyInfoPage).isDisplayed();
    }

}
