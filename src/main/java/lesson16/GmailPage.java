package lesson16;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class GmailPage extends BasePage {

    @FindBy(id="com.google.android.gm:id/action_done")
    private WebElement goToGmailButton;

    @FindBy(id="com.google.android.gm:id/gm_dismiss_button")
    private WebElement welcomeButton;

    @FindBy(id="")
    private WebElement composeButton;


    public GmailPage() throws MalformedURLException {
    }

}
