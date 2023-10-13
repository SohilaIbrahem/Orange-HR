package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P04_PIMPage;

public class TC04_PIMTest extends TestBase{
    @Test
    public void PIMTestPage()
    {
       new P04_PIMPage(driver).UserClickOnPIMPage();
       //TODO:Assert
        Assert.assertTrue(new P04_PIMPage(driver).CheckCheckPIMPageOpenedSuccessfully());
    }
}
