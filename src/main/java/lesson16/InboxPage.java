package lesson16;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InboxPage extends BasePage{

    @FindBy(id = "com.google.android.gm:id/compose_button")
    private WebElement composeButton;

    @FindBy(id = "com.google.android.gm:id/dismiss_button")
    private WebElement tooltipCloseButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
    private WebElement burgerButton;

    @FindBy(xpath = "//*[contains(@text, 'Sent')]")
    private WebElement sentButton;



    public void clickTooltipCloseButton(){

        tooltipCloseButton.click();

    }
    public void clickComposeButton(){
        composeButton.click();

    }

    public void clickBurgerButton() {

        burgerButton.click();
    }

    public void clickSentButton() {
        sentButton.click();
    }
}


