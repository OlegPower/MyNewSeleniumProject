package com.it.project.helpers;

import com.it.project.pages.LoginPage;
import com.it.project.user.Users;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHelper extends LoginPage {

    public void login(String name, String password) {
     /*   WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(inputLogin));*/
        inputLogin.clear();
        inputLogin.sendKeys(name);
        inputPassword.clear();
        inputPassword.sendKeys(password);
        btLogin.click();

    }
    public void login(Users users){
        log.info(String.format("User login userName-%s , password -%s",users.userName, users.password));
        login(users.userName,users.password);

    }
}

