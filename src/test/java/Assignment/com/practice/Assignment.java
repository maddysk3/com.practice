package Assignment.com.practice;

import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Assignment extends ReuseableMethods {
		AccountCreation accountCreation = new AccountCreation();

		// Launch Browser
		@BeforeSuite
		public void launchBrowser() {
			ReuseableMethods.LaunchChromeBrowser();
		}

		// Navigate to Automation Practice page
		@Test(priority = 0)
		public void navitagetoHomePage() throws FileNotFoundException, IOException {
			WebElement signInButton = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
			signInButton.click();

		}

		// Create an account.
		@Test(priority = 1)
		public void createAccount() {
			accountCreation.fillAddress();
		}

		// Select Product from Woman Section
		@Test(priority = 2)
		public void selectProductFromWomanSection() throws InterruptedException {
			ProductSelection.selectProduct();
		}

		/*
		 * Complete the checkout process by completing the payment flow and in
		 * process verifying the total cost of product wherever visible.
		 */
		@Test(priority = 4)
		public void checkoutAndVerifyAmount() throws InterruptedException {
			CheckoutProcess.Checkout();

		}

		/*
		 * After completing the payment process, under Profile page, verify the
		 * amount of order under ORDER HISTORY
		 */
		@Test(priority = 5)
		public void amountVerificationInProfilePage() throws InterruptedException {
			AmountAssertion.amountVerification();
		}

		@AfterSuite
		public void tearDown() {
			driver.quit();
		}

}
