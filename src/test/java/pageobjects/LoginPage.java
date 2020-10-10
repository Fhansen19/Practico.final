package pageobjects;

import utils.WebDriverManagement;

public class LoginPage {
    public static void loginWithValidUser(){

        WebDriverManagement.navigateTo("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        WebDriverManagement.sendKeysById("email", "fertest.diplo@gmail.com");
        WebDriverManagement.sendKeysById("passwd", "156663427");
        WebDriverManagement.clickByCssSelector("#SubmitLogin > span");
    }
}
