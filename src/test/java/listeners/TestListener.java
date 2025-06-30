package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import base.BaseTest;
import utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = ((BaseTest) result.getInstance()).getDriver();
        ScreenshotUtil.captureScreenshot(driver, result.getName());
    }
}