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


public class AT02_ContactUsVerify {
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
		   //Click on menu button
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   Thread.sleep(5000);
		 driver.findElement(By.xpath("//i[@class='btr bt-bars trigger']")).click();;
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   //click on contact us
		   driver.findElement(By.xpath("//li[@id='menu-item-65']/a")).click();;
		 
		 //Assert on PwC Digital Services displayed
		   WebElement DigitalServices=  driver.findElement(By.xpath("//h2[contains(text(),'Digital Services')]"));
		   Assert.assertEquals(true, DigitalServices.isDisplayed());
		   //Click on menu button
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		   //Assert on Digital Pulse editorial team displayed
		    WebElement DigPulEditTeam=  driver.findElement(By.xpath("//span[contains(text(),'Digital Pulse')]"));
		   Assert.assertEquals(true, DigPulEditTeam.isDisplayed());
		   //Click on menu button
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		 
		   //Assert on careers at pwc displayed
		    WebElement CareersAtPWC=  driver.findElement(By.xpath("//span[contains(text(),'Careers at')]"));
		   Assert.assertEquals(true, CareersAtPWC.isDisplayed());
		   //Click on menu button
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		   //Assert on General enquiries displayed
		    WebElement GenEnq=  driver.findElement(By.xpath("//span[contains(text(),'General')]"));
		   Assert.assertEquals(true, GenEnq.isDisplayed());
		   //Click on menu button
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
	}

}
