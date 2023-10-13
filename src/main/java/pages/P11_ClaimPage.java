package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P11_ClaimPage {
    WebDriver driver;

    public P11_ClaimPage (WebDriver driver){
        this.driver=driver;
    }
    private final By ClickOnClaimPage = By.xpath("");
    private final By CheckClaimPage = By.xpath("");

    public Boolean CheckClaimPageOpenedSuccessfully()
    {
        return driver.findElement(this.CheckClaimPage).isDisplayed();
    }
}
