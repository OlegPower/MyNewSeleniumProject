package com.it.project.tests;

import com.it.project.Utils.Utils;
import com.it.project.pages.*;
import com.it.project.user.UserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.rmi.CORBA.Util;

public class MyTest extends BaseTest{
    @Test
    public void test() throws InterruptedException {
     /*   System.out.println(Utils.getRandomString(256));
        System.out.println(UserFactory.getRandomUser(10));
*/
//        app.login.login(validUser);

//        Assert.assertEquals(app.dashBoard.getCurrentUserEmail(), validUser.email);
        Assert.assertTrue(app.login(validUser));


        String title = "prefix :" + System.currentTimeMillis();
        app.sendMail.sendMail(app.dashBoard.getCurrentUserEmail(), title);

        app.dashBoard.openIncomeMessages();

        String latestEmailTitle = app.latestEmailTitle.getLatestEmailTitle();
        app.latestEmailTitle.getLatestEmailTitle();
        Assert.assertEquals(latestEmailTitle, title);

    }
}
