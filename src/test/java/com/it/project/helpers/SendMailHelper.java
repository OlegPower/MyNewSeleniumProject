package com.it.project.helpers;

import com.it.project.pages.SendMailPage;

public class SendMailHelper extends SendMailPage {

    public void sendMail(String receiver, String title) {
        createMail.click();
        mailReceiver.sendKeys(receiver);
        titleInput.sendKeys(title);
        contentOfMessageInput.sendKeys("TEST");
        sendMessageButton.click();
    }
}
