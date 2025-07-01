package tests;

import base.BaseTest;

import org.testng.Assert;
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
        
    String actualurl = driver.getCurrentUrl();
    String expectedurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
    
    Assert.assertEquals(actualurl, expectedurl);
    }
}