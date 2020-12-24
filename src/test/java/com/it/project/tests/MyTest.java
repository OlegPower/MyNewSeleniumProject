package com.it.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest{
    @Test
    public void test() throws InterruptedException {

        Assert.assertTrue(app.login(validUser));


        String title = "prefix :" + System.currentTimeMillis();
        app.sendMail.sendMail(app.dashBoard.getCurrentUserEmail(), title);

        app.dashBoard.openIncomeMessages();

        String latestEmailTitle = app.latestEmailTitle.getLatestEmailTitle();
        app.latestEmailTitle.getLatestEmailTitle();
        Assert.assertEquals(latestEmailTitle, title);

    }
}
