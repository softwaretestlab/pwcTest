package StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.OpenBrowserNavToPWC;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SD01_ClickOnCarouselFF {
	
	@Given("^I navigate to the PwC Digital Pulse website$")
	public void i_navigate_to_the_PwC_Digital_Pulse_website() throws IOException {
		OpenBrowserNavToPWC.NavPWC();
	    
	}

	@When("^I am viewing the 'Home' page$")
	public void i_am_viewing_the_Home_page() {
		//Assert on HomePage
		   WebElement logo=  OpenBrowserNavToPWC.driver.findElement(By.xpath("//img[@class='retina logo-digital-pulse']"));
		   Assert.assertEquals(true, logo.isDisplayed());
	    
	}

	@Then("^I am presented with a carousel displaying (\\d+) featured articles$")
	public void i_am_presented_with_a_carousel_displaying_featured_articles(int arg1) {
		//Assert carousel present
		OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   WebElement carousel=  OpenBrowserNavToPWC.driver.findElement(By.xpath("//li[@class='flex flex-active-slide']"));
		   OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   Assert.assertEquals(true, carousel.isDisplayed());
		   
		   //Assert you are able to see 3 articles on carousel
		   OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   List<WebElement> allElements = OpenBrowserNavToPWC.driver.findElements(By.xpath("//li[@class='flex flex-active-slide']/div"));
		   System.out.println(allElements.size());
		   int count = allElements.size();
		   Assert.assertEquals(3, count);
	    
	}

	@Then("^Clicking the 'Next' button on the carousel will load the next (\\d+) featured articles$")
	public void clicking_the_Next_button_on_the_carousel_will_load_the_next_featured_articles(int arg1) {
		 //click next button on caraousel
		OpenBrowserNavToPWC.driver.findElement(By.xpath("//a[@class='flex-next']")).click();
		 
		OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
	}

	@Then("^Clicking the 'Previous' button on the carousel will load the previous (\\d+) featured articles$")
	public void clicking_the_Previous_button_on_the_carousel_will_load_the_previous_featured_articles(int arg1) {
	    
		//click back button on caraousel
		OpenBrowserNavToPWC.driver.findElement(By.xpath("//a[@class='flex-prev']")).click();
			 
		OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}



}
