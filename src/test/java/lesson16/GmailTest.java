package lesson16;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GmailTest {

    LoginPage loginPage;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        var driver = DriverManager.createDriver();
        PageFactory.initElements(driver, LoginPage.class);
        loginPage = new LoginPage();
    }

    @AfterTest
    public static void tearDown() throws MalformedURLException {
        DriverManager.closeDriver();
    }


    @Test
    public void selectForgotPasswordButton() throws MalformedURLException {


        loginPage.goToGmailAccount();
        loginPage.clickForgotEmailButton();
    }
}
