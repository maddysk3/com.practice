package Assignment.com.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutProcess extends ReuseableMethods{

	/*Complete the checkout process by completing the payment flow and in process verifying the total
	cost of product wherever visible.*/
	public static void Checkout() throws InterruptedException{
		WebElement  getTotalAmt = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[3]/span"));
		String totalAmount= getTotalAmt.getText();

		WebElement checkOutBtn = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkOutBtn.click();

		WebElement summaryCheckOutBtn = driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span"));
		summaryCheckOutBtn.click();

		Thread.sleep(5000);
		WebElement addressCheckOutBtn = driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span"));
		addressCheckOutBtn.click();

		WebElement acceptTermsandCondition = driver.findElement(By.xpath("//*[@id='cgv']"));
		acceptTermsandCondition.click();
		

		WebElement shippingCheckOutBtn = driver.findElement(By.xpath("//*[@id='form']/p/button/span"));
		shippingCheckOutBtn.click();

		WebElement  getPaymentTotalAmt = driver.findElement(By.xpath("//*[@id='total_price']"));
		String totalAmt= getPaymentTotalAmt.getText();
		if(totalAmount.equals(totalAmt)){
			System.out.println("Amount Verfied");
		}
		else{
			System.out.println("Amount Incorrect");
		}

		WebElement paymentMethod = driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a/span"));
		paymentMethod.click();

		WebElement confirmOrder = driver.findElement(By.xpath("//*[@id='cart_navigation']/button/span"));
		confirmOrder.click();

		WebElement orderConfMsg = driver.findElement(By.xpath("//*[@id='center_column']/div/p/strong"));
		System.out.println(orderConfMsg.getText());
	}

}
