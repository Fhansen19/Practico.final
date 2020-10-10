package pageobjects;

import utils.WebDriverManagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.CommonConstans.INFORMATION_UPDATED_SUCCESFULLY;

public class MyPersonalInformationPage {
    public static void updateMyPersonalInformationPage() {
        WebDriverManagement.sendKeysById("firstname", "Fernando");
        WebDriverManagement.sendKeysById("lastname", "Hansen");
        WebDriverManagement.sendKeysById("old_passwd", "156663427");
        WebDriverManagement.sendKeysById("passwd", "156663427");
        WebDriverManagement.sendKeysById("confirmation", "156663427");
        WebDriverManagement.clickById("newsletter");
        WebDriverManagement.clickByCssSelector(".button-medium:nth-child(1) > span");
    }

    public static void validateUpdateInformation() {
        assertEquals(INFORMATION_UPDATED_SUCCESFULLY, WebDriverManagement.getElementsTextByCss(".alert"));
    }
}
