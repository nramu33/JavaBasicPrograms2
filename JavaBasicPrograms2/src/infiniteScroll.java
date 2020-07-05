import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.*;

public class infiniteScroll {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jabong.com");
		driver.manage().window().maximize();
		//Alert alerts=new 
		WebElement Logo=driver.findElement(By.xpath("//a[.='Jabong']"));
		
		
		driver.quit();
	}

}
