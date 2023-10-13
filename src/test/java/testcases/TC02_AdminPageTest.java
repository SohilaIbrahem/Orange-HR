package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_HomePage;
import pages.P03_AdminPage;
import utilities.utlity;

public class TC02_AdminPageTest extends TestBase{

    @Test
    public void AdminPageTest()
    {
        new P03_AdminPage(driver).UserClickOnAdmin();
        //TODO:capture screenshot
        utlity.captureScreenshot(driver,"admin-page");
        // TODO: assert Admin page opened successfully
        Assert.assertTrue(new P03_AdminPage(driver).CheckAdminPageOpenedSuccessfully());
    }
}
