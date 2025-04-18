import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleFour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//select dropdown is nothing but special select class only for static dropdowns'
		WebElement StaticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(StaticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		

	}

}
