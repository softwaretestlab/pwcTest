package PlayPen;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PropertiesFIle.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class AT01_NavToPWCHomePage {
	public static WebDriver driver;
	@Test
	public void NavPWCHomepage() throws IOException {
		
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
		   //Assert carousel present
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   WebElement carousel=  driver.findElement(By.xpath("//li[@class='flex flex-active-slide']"));
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   Assert.assertEquals(true, carousel.isDisplayed());
		   //Assert you are able to see 3 articles on carousel
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   List<WebElement> allElements = driver.findElements(By.xpath("//li[@class='flex flex-active-slide']/div"));
		   System.out.println(allElements.size());
		   int count = allElements.size();
		   Assert.assertEquals(3, count);
		   //click next button on caraousel
		   driver.findElement(By.xpath("//a[@class='flex-next']")).click();
		 
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   //click back button on caraousel
		   driver.findElement(By.xpath("//a[@class='flex-prev']")).click();
			 
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
	}

}
