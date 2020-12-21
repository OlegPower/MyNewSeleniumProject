package com.it.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomingMailsPage extends BasePage {

    @FindBy(xpath = "//span[@class='sbj']/span")
    protected WebElement latestEmailTitle;

}
