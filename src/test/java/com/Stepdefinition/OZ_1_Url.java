package com.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OZ_1_Url {
	
	WebDriver driver;
	@Given("User Should Enter the WebDriver.")
	public void user_should_enter_the_web_driver() {
		 driver=new ChromeDriver();
		 driver.get("https://www.ozsale.com.au/");
	    
	}
	@When("User should Enter the Url {string}")
	public void user_should_enter_the_url(String url) {
		
	    
	}
	@Then("User should verify after Url success message")
	public void user_should_verify_after_url_success_message() {
		WebElement HmSucess=driver.findElement(By.cssSelector("div[class='xNc92']"));
		String text = HmSucess.getText();
		System.out.println(text);
	    
	}




}
