package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_Login;
import pages.P02_HomePage;
import retry.Retry;
import screenRecorder.MyScreenRecorder;
import utilities.utlity;

public class TC01_Login extends TestBase{

    private String username= utlity.getData(System.getProperty("user.dir")+"/src/test/resources/testData/loginData.json","username");
    private String password=utlity.getData(System.getProperty("user.dir")+"/src/test/resources/testData/loginData.json","password");;

    @Test(priority = 1,description = "Login with Valid Credientials")
    public void loginWithValidCredientials_P() {
        new P01_Login(driver).addUserName(username).addPassword(password).clickLoginButton();
        //TODO:capture screenshot
        utlity.captureScreenshot(driver, "P_login");
        //TODO:Assert login successfully
        Assert.assertTrue(new P02_HomePage(driver).checkProfilePage());

    }


    @Test(priority = 1,description = "Login with Valid Credientials")
    public void loginWithInvalidCredientials_N(){
        username="lfdkl";
        password="sdlfkmd";
        new P01_Login(driver).addUserName(username).addPassword(password).clickLoginButton();
    }
}
