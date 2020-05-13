package Assignment.com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmountAssertion extends ReuseableMethods {

	public static void amountVerification() throws InterruptedException{
		WebElement amount = driver.findElement(By.xpath("//span[@class='price']"));
		String totalAmt= amount.getText();
		System.out.println(totalAmt);
		WebElement profileName = driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a/span"));
		profileName.click();

		WebElement orderHistory = driver.findElement(By.xpath("//*[@id='center_column']/div/div[1]/ul/li[1]/a/span"));
		orderHistory.click();

		WebElement verifyTotalAmount = driver.findElement(By.xpath("//*[@id='order-list']/tbody/tr[1]/td[3]/span"));
		String totalAmount= verifyTotalAmount.getText();
		System.out.println(totalAmount);
		if(totalAmount.equals(totalAmt)){
			System.out.println("Amount Verfied");
		}
		else{
			System.out.println("Amount Incorrect");
		}
	}
}
