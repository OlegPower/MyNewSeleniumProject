package com.it.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//input[@name='login']")
    protected WebElement inputLogin;

    @FindBy(xpath = "//input[@name='pass']")
    protected WebElement inputPassword;

    @FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
    protected WebElement btLogin;
}

