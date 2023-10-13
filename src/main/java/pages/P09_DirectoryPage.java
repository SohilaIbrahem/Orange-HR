package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_DirectoryPage {
    WebDriver driver;

    public P09_DirectoryPage (WebDriver driver){
        this.driver=driver;
    }
    private final By ClickOnDirectoryPage = By.xpath("");
    private final By CheckDirectoryPage = By.xpath("");

    public Boolean CheckDirectoryPageOpenedSuccessfully()
    {
        return driver.findElement(this.CheckDirectoryPage).isDisplayed();
    }
}
