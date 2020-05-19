package com.stepdefinition;
import com.base.LibGlobal;
import com.objectrepository.AddCartPageObject;
import com.objectrepository.LoginPageObject;
import com.objectrepository.SearchPageObject;
import com.objectrepository.SelectPageObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerLogin extends LibGlobal {
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		launch();   
	}	
	@Then("user enters url")
	public void user_enters_url() {
		LoginPageObject l = new LoginPageObject();
		loadUrl("https://www.tobi.com/ca");	
	    buttonClick(l.getSignin());
	}
	@When("user enters {string} and {string} valid credential")
	public void user_enters_and_valid_credential(String string, String string2) throws InterruptedException {
		LoginPageObject l = new LoginPageObject();
		Thread.sleep(6000);
		write(l.getUser(),string);
		write(l.getPwd(),string2);
	}	
	@And("user click login button")
	public void user_click_login_button() {
		LoginPageObject l = new LoginPageObject();
		buttonClick(l.getLogin());
		System.out.println("Successful Login");
	}	
	@Then("user click search link")
	public void user_click_search_link() throws InterruptedException {
		SearchPageObject s= new SearchPageObject();
		Thread.sleep(12000);
		buttonClick(s.getSearch());	
	}
	@When("user enter {string} search product")
	public void user_enter_search_product(String string3) throws InterruptedException {
		SearchPageObject s= new SearchPageObject();
		Thread.sleep(12000);
		write(s.getSearchterm(),string3);		
	}
	@When("user click search button")
	public void user_click_search_button() throws InterruptedException {
		SearchPageObject s= new SearchPageObject();
		Thread.sleep(6000);
		buttonClick(s.getSearchbutton());
	}
	
	@Then("user select product")
	public void user_select_product() throws Throwable {
		SelectPageObject sl= new SelectPageObject();
		Thread.sleep(6000);
		buttonClick(sl.getSelect());	   
	}

	@Then("user choose size and add product to cart")
	public void user_choose_size_and_add_product_to_cart() throws InterruptedException {
		AddCartPageObject ac= new AddCartPageObject();
		Thread.sleep(6000);
		buttonClick(ac.getSize());
		buttonClick(ac.getAdd());
	}

	@Then("user click to view cart")
	public void user_click_to_view_cart() {
		AddCartPageObject ac= new AddCartPageObject();
		buttonClick(ac.getCart());
	    
	}

}
