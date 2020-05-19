package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectPageObject extends LibGlobal {
	public SelectPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Zane White Multi Colorblock Windbreaker Jacket']")
	private WebElement select;

	public WebElement getSelect() {
		return select;
	}
	
	
	

}
