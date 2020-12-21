package com.it.project;

import com.it.project.helpers.*;
import com.it.project.user.Users;

public class App {
    public CommonHelper common;
    public DashBoardHelper dashBoard;
    public LoginHelper login;
    public SendMailHelper sendMail;
    public IncomingMailsPageHelper latestEmailTitle;

    public App() {
        common = new CommonHelper();
        dashBoard = new DashBoardHelper();
        login = new LoginHelper();
        sendMail = new SendMailHelper();
        latestEmailTitle = new IncomingMailsPageHelper();
    }

    public boolean login(Users users) {
        login.login(users);
        common.takeSnapShot();
        return dashBoard.userIsLogined(users);

    }
}
