package ineuronpratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ineuronsignup {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions	opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
WebDriver driver=new ChromeDriver(opt);
driver.get("https://ineuron-courses.vercel.app/signup");
Thread.sleep(2000);
driver.manage().window().maximize();

driver.findElement(By.id("name")).sendKeys("soundarya");

driver.findElement(By.id("email")).sendKeys("sony@gmail.com");

driver.findElement(By.id("password")).sendKeys("yuvan$09");

driver.findElement(By.xpath("//label[text()='Selenium']")).click();

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


JavascriptExecutor js = (JavascriptExecutor)driver;  
js.executeScript("scrollBy(0, 2500)"); 

driver.findElement(By.xpath("//input[@value='Female']")).click();

Select state=new Select(driver.findElement(By.id("state")));

state.selectByValue("Andhra Pradesh");


JavascriptExecutor js1 = (JavascriptExecutor)driver;  
js1.executeScript("scrollBy(0, 4500)"); 
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//button[text()='Sign up']")).click();

	}

}
