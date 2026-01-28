package working_with_sc_methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Expressions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(500);
		
		
		WebElement un = driver.findElement(By.cssSelector("#email"));
		un.sendKeys("Admin");
		Thread.sleep(500);
		
		WebElement pwd = driver.findElement(By.cssSelector("._9npi"));
		pwd.sendKeys("12345678");
		Thread.sleep(500);
		
//		WebElement loginButton = driver.findElement(By.cssSelector("button"));
//		loginButton.click();
//		Thread.sleep(2000);
//				
		WebElement CreateNewAcc = driver.findElement(By.cssSelector("._6lti"));
		CreateNewAcc.click();
		Thread.sleep(500);
		
		WebElement fn = driver.findElement(By.cssSelector("._5dba"));
		fn.sendKeys("Saurabh");
		Thread.sleep(500);
		
		WebElement ln = driver.findElement(By.cssSelector("input[name='lastname']"));
		ln.sendKeys("Maurya");
		Thread.sleep(500);

		
		
		driver.quit();
		
	}
}