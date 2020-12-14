package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.OpenBrowserNavToPWC;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SD02_ContactUSVerify {

	@When("^I select 'Contact us' from the hamburger menu$")
	public void i_select_Contact_us_from_the_hamburger_menu()  {
		 //Click on menu button
		   OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		 OpenBrowserNavToPWC.driver.findElement(By.xpath("//i[@class='btr bt-bars trigger']")).click();;
		   
		   
	}

	@Then("^I am taken to the 'Contact us' page$")
	public void i_am_taken_to_the_Contact_us_page()  {
		OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click on contact us
		   OpenBrowserNavToPWC.driver.findElement(By.xpath("//li[@id='menu-item-65']/a")).click();;
	}

	@Then("^I am presented with the below options for contacts$")
	public void i_am_presented_with_the_below_options_for_contacts()  {
		 //Assert on PwC Digital Services displayed
		   WebElement DigitalServices=  OpenBrowserNavToPWC.driver.findElement(By.xpath("//h2[contains(text(),'Digital Services')]"));
		   Assert.assertEquals(true, DigitalServices.isDisplayed());
		   //Click on menu button
		   OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   //Assert on Digital Pulse editorial team displayed
		    WebElement DigPulEditTeam=  OpenBrowserNavToPWC.driver.findElement(By.xpath("//span[contains(text(),'Digital Pulse')]"));
		   Assert.assertEquals(true, DigPulEditTeam.isDisplayed());
		   //Click on menu button
		   OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		 
		   //Assert on careers at pwc displayed
		    WebElement CareersAtPWC=  OpenBrowserNavToPWC.driver.findElement(By.xpath("//span[contains(text(),'Careers at')]"));
		   Assert.assertEquals(true, CareersAtPWC.isDisplayed());
		   //Click on menu button
		   OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   //Assert on General enquiries displayed
		    WebElement GenEnq=  OpenBrowserNavToPWC.driver.findElement(By.xpath("//span[contains(text(),'General')]"));
		   Assert.assertEquals(true, GenEnq.isDisplayed());
		   //Click on menu button
		   OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	}



}
