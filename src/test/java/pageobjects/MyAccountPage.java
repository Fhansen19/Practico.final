package pageobjects;

import utils.WebDriverManagement;

public class MyAccountPage {

    public static void navigateToMyPersonalInformation(){
        WebDriverManagement.clickByCssSelector("li:nth-child(4) span:nth-child(2)");
    }
}
