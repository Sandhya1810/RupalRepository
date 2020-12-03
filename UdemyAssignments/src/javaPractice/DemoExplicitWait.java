package javaPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Rupal Study Material\\Selenium Class\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
	     driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
	     
	     WebDriverWait wait =new WebDriverWait(driver,10);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
	     System.out.println(driver.findElement(By.id("results")).getText());
	     
	     

	}

}
