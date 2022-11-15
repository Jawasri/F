package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		
	WebElement explorecourse =	driver.findElement(By.xpath("/html/body/app-root/app-main/section[2]/div[1]/div[1]/div[1]/div/div/a"));
	explorecourse.click();
	
	
	WebElement workalert = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a"));
	workalert.click();
	
	WebElement SimpleAlert = driver.findElement(By.id("accept"));
	SimpleAlert.click();
	Alert ok = driver.switchTo().alert();
	ok.accept();
	
	WebElement ConfirmAlert = driver.findElement(By.id("confirm"));
	ConfirmAlert.click();
	Alert ok1 = driver.switchTo().alert();
	ok1.dismiss();
	
	WebElement PromptAlert = driver.findElement(By.id("prompt"));
	PromptAlert.click();
	Alert ok2 = driver.switchTo().alert();
	ok2.sendKeys("dude");
	ok2.accept();
	
	WebElement SweetAlert = driver.findElement(By.id("modern"));
	SweetAlert.click();
	Alert ok3 = driver.switchTo().alert();
	ok3.dismiss();
	
	
		
	}

}
