package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchPageObject extends LibGlobal {
	public SearchPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement searchbutton;
	
	public WebElement getSearchbutton() {
		return searchbutton;
	}

	@FindBy(xpath="//a[text()='Search']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="(//input[@name='search_term'])[2]")
	private WebElement searchterm;

	public WebElement getSearchterm() {
		return searchterm;
	}
	
}

