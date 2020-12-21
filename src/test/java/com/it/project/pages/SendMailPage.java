package com.it.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMailPage extends BasePage {

    @FindBy(xpath = "//span[@class='field']/textarea")
    protected WebElement mailReceiver;

    @FindBy(xpath = "//input[@name='subject']")
    protected WebElement titleInput;

    @FindBy(xpath = "//input[@name='send']")
    protected WebElement sendMessageButton;

    @FindBy(xpath = "//div[@class='text_editor_browser']/textarea")
    protected WebElement contentOfMessageInput;

    @FindBy(xpath = "//p[@class='make_message']/a")
    protected WebElement createMail;
}
