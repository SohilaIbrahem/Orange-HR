package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P06_TimePage;

public class TC06_TimePageTest extends TestBase{
    @Test
    public void TimePageTest()
    {
        new P06_TimePage(driver).UserClickOnTimePage();
        //TODO: Assert
        Assert.assertTrue(new P06_TimePage(driver).CheckAdminPageOpenedSuccessfully());
    }
}
