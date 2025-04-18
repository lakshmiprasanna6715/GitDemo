import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class ExampleThree {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name="rahul";
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("chkboxTwo")).click();
		
		//xpath with contains keyword
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.tagName("P")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("P")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'login-container')] //h2")).getText(), "Hello " +name+ ",");
		
		driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		driver.close();
		

	}

}
