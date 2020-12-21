package com.it.project.tests;

import com.it.project.App;
import org.testng.annotations.AfterSuite;
import com.it.project.user.UserFactory;
import com.it.project.user.Users;

public class BaseTest {
    static App app = new App();
    static Users validUser= UserFactory.getValidUser();

    @AfterSuite
    public void afterSuite() {
        app.common.close();
    }
}
