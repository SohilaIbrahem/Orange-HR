package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_Login {
    // web driver
    //constructor to initialize webdriver
    // define locators using by
    // define action methods
    WebDriver driver;

    public P01_Login (WebDriver driver){
        this.driver=driver;
    }
    final private By USERNAME_TEXT=By.xpath("//input[@name=\"username\"]");
    final private By PASSWORD_TEXT=By.xpath("//input[@name=\"password\"]");
    final private By LOGIN_BUTTON=By.xpath("//button[@type=\"submit\"]");

    public P01_Login addUserName(String Username){
        driver.findElement(this.USERNAME_TEXT).sendKeys(Username);
        return this;
    }
    public P01_Login addPassword(String Password){
        driver.findElement(this.PASSWORD_TEXT).sendKeys(Password);
        return this;
    }
    public P01_Login clickLoginButton(){
        driver.findElement(this.LOGIN_BUTTON).click();
        return this;
    }

}
