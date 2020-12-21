package com.it.project.helpers;

import com.it.project.pages.DashBoardPage;
import com.it.project.user.Users;

public class DashBoardHelper extends DashBoardPage {

    public void openIncomeMessages() {
        incomeMessageButton.click();
    }

    public String getCurrentUserEmail() {
        return currentUserEmail.getText();
    }

    public boolean userIsLogined(Users users) {
        return getCurrentUserEmail().equals(users.email);
    }
}
