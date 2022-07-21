package com.upgenix.stepDefinitions;

import com.upgenix.pages.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class CalendarStepDef_Nurefsan extends BasePage {

    @Given("<{string}> is on the login page")
    public void is_on_the_login_page(String user, DataTable dataTable) {

        switch (dataTable.asMap().get(user)) {
            case "salesmanager":
                BasePage.loginAsSalesManager();
                break;
            case "posmanager":
                BasePage.loginAsPosManager();
                break;
        }

//        if (userType.equalsIgnoreCase("salesManager")) {
//            BasePage.loginAsSalesManager();
//        } else {
//            BasePage.loginAsPosManager();
//        }
    }
}
