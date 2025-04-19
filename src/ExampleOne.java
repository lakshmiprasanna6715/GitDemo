import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleOne {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		Thread.sleep(3000);
	
		System.out.println("URL name");
		System.out.println("academy name");
		
		
		driver.close();
		
		
		
	}

}
