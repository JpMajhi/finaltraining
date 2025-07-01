package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ClaimPage;
import pages.LoginPage;
import utils.ExcelUtil;

public class ClaimTest extends BaseTest{
    @DataProvider
    public Object[][] loginData() {
        return ExcelUtil.getTestData("src\\testdata\\LoginData.xlsx", "Sheet1");
    }

    @Test(dataProvider = "loginData")
    public void assignClaimTest(String username, String password) throws InterruptedException {
        // Step 1: Login using Excel data
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);


	        // 2. work with ClaimPage
	        ClaimPage claimPage = new ClaimPage(driver);
	        claimPage.openClaimSection();
	        claimPage.assignClaim();
	        
	        boolean claimtst = driver.findElement(By.xpath("//a[text()='Employee Claims']")).isDisplayed();
	        		Assert.assertTrue(claimtst);

	    }
}
