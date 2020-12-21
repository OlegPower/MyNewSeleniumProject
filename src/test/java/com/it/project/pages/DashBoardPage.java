package com.it.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    protected WebElement currentUserEmail;

    @FindBy(xpath = "//li[@class='new']/a")
    protected WebElement incomeMessageButton;
}
