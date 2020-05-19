package com.objectrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class AddCartPageObject extends LibGlobal{
	public AddCartPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[text()=' L ']")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}
	@FindBy(xpath="//button[text()='Add to Bag']")
	private WebElement add;

	public WebElement getAdd() {
		return add;
	}
	
	@FindBy(xpath="//a[text()='My Bag (']")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}
	
	
	

}
