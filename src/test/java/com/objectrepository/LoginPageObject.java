package com.objectrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;
public class LoginPageObject extends LibGlobal {
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement user;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement login;
	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement signin;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getSignin() {
		return signin;
	}
	
	
}
