package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P05_LeavePage;

public class TC05_LeaveTest extends TestBase{
    @Test
    public void LeavePageTest()
    {
        new P05_LeavePage(driver).UserClickOnLeavePage();
        //TODO : Assert
        Assert.assertTrue(new P05_LeavePage(driver).CheckLeavePageOpenedSuccessfully());

    }
}
