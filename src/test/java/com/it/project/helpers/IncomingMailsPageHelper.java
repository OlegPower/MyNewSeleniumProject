package com.it.project.helpers;

import com.it.project.pages.IncomingMailsPage;

public class IncomingMailsPageHelper extends IncomingMailsPage {


    public String getLatestEmailTitle() {
        return latestEmailTitle.getText();
    }
}
