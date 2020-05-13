package Assignment.com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation extends ReuseableMethods{

	public void fillAddress(){

		WebElement enterEmail = driver.findElement(By.id("email_create"));
		//Will generate random email id everytime
		enterEmail.sendKeys(ReuseableMethods.randomEmailID()+"@gmail.com");
		WebElement clickRegister = driver.findElement(By.xpath("//*[@id='SubmitCreate']/span"));
		clickRegister.click();
		//Select Title
		WebElement selectTitle = driver.findElement(By.id("id_gender1"));
		selectTitle.click();
		// Enter the First Name
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		firstName.sendKeys("Miresh");
		// Enter the Last Name
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.sendKeys("Sonkamble");
		// Set Password
		WebElement setPassword = driver.findElement(By.id("passwd"));
		setPassword.sendKeys("Miresh@1234");

		// Set Address
		WebElement addressLine1 = driver.findElement(By.xpath("//*[@id='address1']"));
		addressLine1.sendKeys("Pune 380062");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Navi Mumbai");

		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Georgia");

		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("38006");

		WebElement mobilenumber = driver.findElement(By.id("phone_mobile"));
		mobilenumber.sendKeys("9876543210");

		WebElement register = driver.findElement(By.xpath("//*[@id='submitAccount']/span"));
		register.click();
	}

}
