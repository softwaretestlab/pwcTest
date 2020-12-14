package StepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import BaseClass.OpenBrowserNavToPWC;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SD03_SearchFunctionality {
	
	@When("^I click on the 'Magnifying glass' icon to perform a search$")
	public void i_click_on_the_Magnifying_glass_icon_to_perform_a_search()  {
		//Click on Search
		   OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   OpenBrowserNavToPWC.driver.findElement(By.xpath("//i[@class='btr bt-search']")).click();;
		   
	   
	}

	@When("^I enter the text 'Single page applications'$")
	public void i_enter_the_text_Single_page_applications()  {
		OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Enter text to search
		   OpenBrowserNavToPWC.driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("Single page applications");
		  
	}

	@When("^I submit the search$")
	public void i_submit_the_search()  {
		 OpenBrowserNavToPWC.driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys(Keys.RETURN);
	   
	}

	@Then("^I am taken to the search results page$")
	public void i_am_taken_to_the_search_results_page()  {
		//Assert search results page appeared
		   WebElement SearchResPage=  OpenBrowserNavToPWC.driver.findElement(By.xpath("//span[contains(text(),'Showing search results for')]"));
		   Assert.assertEquals(true, SearchResPage.isDisplayed());
		   //Click on menu button
		   OpenBrowserNavToPWC.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		   
	   
	}

	@Then("^I am presented with at least (\\d+) search result$")
	public void i_am_presented_with_at_least_search_result(int arg1)  {
	    
		//Count number of results
	    List<WebElement> CountOfRes=  OpenBrowserNavToPWC.driver.findElements(By.xpath("//div[@class='row inner']/div"));
	    System.out.println(CountOfRes.size());
	    int count = CountOfRes.size();
	    Assert.assertNotNull(count);
	}

}
