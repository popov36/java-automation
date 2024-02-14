package lesson16;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class GmailTest {

    LoginPage loginPage;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        var driver = DriverManager.getDriver();
        PageFactory.initElements(driver, LoginPage.class);
        PageFactory.initElements(driver, InboxPage.class);
        PageFactory.initElements(driver, ComposeEmailPage.class);
        PageFactory.initElements(driver, MailPage.class);
        loginPage = new LoginPage();
    }

    @AfterTest
    public static void tearDown() throws MalformedURLException {
        DriverManager.closeDriver();
    }


    @Test (enabled = false)
    public void selectForgotPasswordButton() throws MalformedURLException {


        loginPage.goToGmailAccount();
        loginPage.clickForgotEmailButton();
    }


    @Test
    public void checkSuccessfulMailSending() {
        InboxPage inboxPage = new InboxPage();
        ComposeEmailPage composeEmailPage = new ComposeEmailPage();
        SentMessages sentMessagesPage = new SentMessages();
        MailPage mailPage = new MailPage();


        loginPage.goToGmailAccount();
        loginPage.clickTakeMeToGmailButton();
        inboxPage.clickTooltipCloseButton();
        inboxPage.clickComposeButton();
        composeEmailPage.inputRecipient("denis.popov@amo.tech");
        composeEmailPage.clickEmailFromDropDownList();
        composeEmailPage.inputMessage("Test message 1");
        composeEmailPage.tapToSendButton();
        inboxPage.clickComposeButton();
        composeEmailPage.inputRecipient("denis.popov@amo.tech");
        composeEmailPage.clickEmailFromDropDownList();
        composeEmailPage.inputMessage("Test message 2");
        composeEmailPage.tapToSendButton();
        inboxPage.clickComposeButton();
        composeEmailPage.inputRecipient("denis.popov@amo.tech");
        composeEmailPage.clickEmailFromDropDownList();
        composeEmailPage.inputMessage("Test message 3");
        composeEmailPage.tapToSendButton();
        inboxPage.clickComposeButton();
        composeEmailPage.inputRecipient("denis.popov@amo.tech");
        composeEmailPage.clickEmailFromDropDownList();
        composeEmailPage.inputMessage("Test message 4");
        composeEmailPage.tapToSendButton();
        inboxPage.clickComposeButton();
        composeEmailPage.inputRecipient("denis.popov@amo.tech");
        composeEmailPage.clickEmailFromDropDownList();
        composeEmailPage.inputMessage("Test message 5");
        composeEmailPage.tapToSendButton();
        inboxPage.clickBurgerButton();
        inboxPage.clickSentButton();
        sentMessagesPage.clickOnMailWithText("Test message 3");
        mailPage.deleteMail();
        sentMessagesPage.clickOnMailWithText("Test message 5");
        mailPage.deleteMail();



//        for(int i = 5; i > 0; i--) {
//            inboxPage.clickComposeButton();
//            composeEmailPage.inputRecipient("fdf");
//            composeEmailPage.inputMessage("fdf");
//            click send

        }

        @Test(enabled = false)
        public void checkSentMessages() {
            InboxPage inboxPage = new InboxPage();
            SentMessages sentMessagesPage = new SentMessages();
            MailPage mailPage = new MailPage();

            loginPage.goToGmailAccount();
            loginPage.clickTakeMeToGmailButton();
            inboxPage.clickTooltipCloseButton();
            inboxPage.clickBurgerButton();
            inboxPage.clickSentButton();
            sentMessagesPage.clickOnMailWithText("Test message 3");
            mailPage.deleteMail();
            sentMessagesPage.clickOnMailWithText("Test message 5");
            mailPage.deleteMail();



//            Assert.assertEquals("");

        }

    }

