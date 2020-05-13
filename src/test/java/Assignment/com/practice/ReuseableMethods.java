package Assignment.com.practice;

import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReuseableMethods {

	public static WebDriver driver;
	public static void LaunchChromeBrowser(){
		String exePath = System.getProperty("user.dir") + "//driver//chromedriver";
		System.setProperty("webdriver.chrome.driver",exePath );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	public static String randomEmailID(){
		String SALTCHARS = "abcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}
}
