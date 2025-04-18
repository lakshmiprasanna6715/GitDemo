import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTwo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("P.error")).getText()); 
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("prasanna");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("Pr@sanna.com");
		Thread.sleep(2000);
		//using xpath with index
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("prasanna@gmail.com");
		//using xpath of parent to child
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("987654321");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("chkboxTwo")).click();
		
		//xpath with contains keyword
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'login-container')]")).getText());
		// or with tagname By.tagname("P")
	}

}
