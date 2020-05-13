package Assignment.com.practice;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductSelection extends ReuseableMethods {

	/*On WOMAN section, select any 1 product by clicking on QUICK VIEW and adding 2 Qty for the
	product to cart.*/
	public static void selectProduct() throws InterruptedException{
		
		WebElement womanSection = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		womanSection.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,620)", "");
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
		actions.moveToElement(menuOption).perform();
		WebElement quickView = driver.findElement(By.xpath("//a[@class='quick-view']"));
		quickView.click();
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(iframe);
		WebElement plusButton = driver.findElement(By.xpath("//*[@id='quantity_wanted']"));
		plusButton.clear();
		plusButton.sendKeys("2");
		WebElement  addToCardBtn = driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span"));
		addToCardBtn.click();
		driver.switchTo().defaultContent();
	}
}
