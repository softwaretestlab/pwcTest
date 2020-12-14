package PlayPen;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PropertiesFIle.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class AT03_SearchFunctioanlity {
	public static WebDriver driver;
	@Test
	public void NavPWCHomepage() throws IOException, InterruptedException {
		
	    WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
       
		   driver.get(ReadPropertiesFile.PropFile("url"));
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   //Assert on HomePage
		   WebElement logo=  driver.findElement(By.xpath("//img[@class='retina logo-digital-pulse']"));
		   Assert.assertEquals(true, logo.isDisplayed());
		   
		   //Click on Search
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//i[@class='btr bt-search']")).click();;
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		   //Enter text to search
		   driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Single page applications");
		   driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys(Keys.RETURN);
		 
		 //Assert search results page appeared
		   WebElement SearchResPage=  driver.findElement(By.xpath("//span[contains(text(),'Showing search results for')]"));
		   Assert.assertEquals(true, SearchResPage.isDisplayed());
		   //Click on menu button
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		   //Count number of results
		    List<WebElement> CountOfRes=  driver.findElements(By.xpath("//div[@class='row inner']/div"));
		    System.out.println(CountOfRes.size());
		    int count = CountOfRes.size();
		    Assert.assertNotNull(count);
		  
		   
		   
	}

}
