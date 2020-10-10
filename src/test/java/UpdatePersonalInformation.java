import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import pageobjects.MyAccountPage;
import pageobjects.MyPersonalInformationPage;
import utils.WebDriverManagement;

public class UpdatePersonalInformation {

    @BeforeEach
    public void setUp() {
        WebDriverManagement.driverInitialization();
    }

    @AfterEach
    public void tearDown() {
        WebDriverManagement.quitDriver();
    }

    @Test
    public void updateInformationTest() {

        LoginPage.loginWithValidUser();

        MyAccountPage.navigateToMyPersonalInformation();

        MyPersonalInformationPage.updateMyPersonalInformationPage();

        MyPersonalInformationPage.validateUpdateInformation();

    }
}
