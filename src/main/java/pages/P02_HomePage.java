package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_HomePage {
    WebDriver driver;

    public P02_HomePage (WebDriver driver){
        this.driver=driver;
    }
    final private By USERPROFILE=By.xpath("//p[@class=\"oxd-userdropdown-name\"]");

    public boolean checkProfilePage(){
      return  driver.findElement(this.USERPROFILE).getText().equals("NeetaTyler MayoTyler Mayo phaseKayla Cameron");

    }
}
