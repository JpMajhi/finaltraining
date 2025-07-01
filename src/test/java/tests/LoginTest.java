package tests;

import base.BaseTest;

import org.testng.annotations.*;
import pages.LoginPage;
import utils.ExcelUtil;

public class LoginTest extends BaseTest {

    @DataProvider
    public Object[][] loginData() {
        return ExcelUtil.getTestData("src\\testdata\\LoginData.xlsx", "Sheet1");
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        

      //span[text()='Admin']
    
//        Thread.sleep(2000);          // wait for menu to load
//        claimPage.openClaimSection();
//        claimPage.assignClaim();


    }
}