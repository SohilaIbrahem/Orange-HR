package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P12_BuzzPage {
    WebDriver driver;

    public P12_BuzzPage (WebDriver driver){
        this.driver=driver;
    }
    private final By ClickOnBuzzPage  = By.xpath("");
    private final By CheckBuzzPage = By.xpath("");

    public Boolean CheckBuzzPageOpenedSuccessfully()
    {
        return driver.findElement(this.CheckBuzzPage).isDisplayed();
    }
}
