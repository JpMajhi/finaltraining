package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClaimPage {
	 private WebDriver driver;

	    // Locators
	    private By claimMenu       = By.xpath("//span[text()='Claim']");
	    private By assignClaimBtn  = By.xpath("//button[text()=' Assign Claim ']");

	    public ClaimPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Click the “Claim” side‑menu
	    public void openClaimSection() {
	        driver.findElement(claimMenu).click();
	    }

	    // Click the “Assign Claim” button
	    public void assignClaim() {
	        driver.findElement(assignClaimBtn).click();
	    }

	    // Convenience wrapper
	    public void openAndAssignClaim() {
	        openClaimSection();
	        assignClaim();
	    }
}
