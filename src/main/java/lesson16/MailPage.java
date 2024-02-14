package lesson16;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailPage extends BasePage{

    @FindBy(id = "com.google.android.gm:id/delete")
    private WebElement deleteMailButton;

    public void deleteMail(){

        deleteMailButton.click();
    }

}
