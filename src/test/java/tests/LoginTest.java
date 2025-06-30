package tests;

import base.BaseTest;

import org.openqa.selenium.By;
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
        
        driver.findElement(By.xpath("//span[text()='Claim']")).click();
        driver.findElement(By.xpath("//button[text()=' Assign Claim ']")).click();
      //span[text()='Admin']

    }
}