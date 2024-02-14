package lesson16;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
public class LoginPage extends BasePage{

    @FindBy(id = "com.google.android.gm:id/welcome_tour_got_it")
    private WebElement understandButton;

    @FindBy(id = "com.google.android.gm:id/setup_addresses_add_another")
    private WebElement addAccountButton;

    @FindBy(id = "com.google.android.gm:id/account_setup_item")
    private WebElement gmailAccountButton;

    @FindBy(className = "android.widget.Button")
    private WebElement forgotEmailButton;

    @FindBy(id = "identifierId")
    private WebElement emailInput;

    @FindBy(id = "view_container")
    private WebElement window;

    @FindBy(id = "identifierNext")
    private WebElement nextButton;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "passwordNext")
    private WebElement passwordNextButton;

    @FindBy(id = "signinconsentNext")
    private WebElement acceptButton;

    @FindBy(id = "com.google.android.gm:id/action_done")
    private WebElement takeMeToGmailButton;


    public void goToGmailAccount() {
        understandButton.click();
//        addAccountButton.click();
//        gmailAccountButton.click();
    }

    public void addNewGmailAccount(String email, String password) {
        emailInput.sendKeys(email);
        window.click();
        nextButton.click();
        passwordInput.sendKeys(password);
        passwordNextButton.click();

    }

    public boolean verifyCorrectData() {
        return acceptButton.isDisplayed();
    }

    public void clickAcceptButton() {
        acceptButton.click();
    }

    public void clickForgotEmailButton() {
        forgotEmailButton.click();
    }

    public void clickTakeMeToGmailButton(){

        takeMeToGmailButton.click();
    }

    public LoginPage() throws MalformedURLException {
    }

}
