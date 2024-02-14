package lesson16;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ComposeEmailPage extends BasePage {

    @FindBy(xpath = "//*[contains(@resource-id, 'peoplekit_autocomplete_chip_group')]/child::*")
    private WebElement recipientInputField;


    @FindBy(xpath = "//*[contains(@resource-id, 'wc_body_layout')]//android.widget.EditText")
    private WebElement messageInputField;

    @FindBy(id = "com.google.android.gm:id/send")
    private WebElement sentButton;

    @FindBy(xpath = "//*[contains(@text, 'Denis Popov')]")
    private WebElement dropDownMailList;




    public void inputRecipient(String recipient) {
        recipientInputField.sendKeys(recipient);
    }

    public void inputMessage (String message) {

        messageInputField.sendKeys(message);

    }

    public void tapToSendButton() {

        sentButton.click();
    }

    public void clickEmailFromDropDownList(){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        dropDownMailList.click();

    }
}
