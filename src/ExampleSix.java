import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleSix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		//Dynamic Dropdowns
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		//using parent child relationship
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
		
		
		
	}

}
