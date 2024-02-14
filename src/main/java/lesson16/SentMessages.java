package lesson16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SentMessages extends BasePage{


    public void clickOnMailWithText (String text){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElements(By.id("com.google.android.gm:id/viewified_conversation_item_view"))
                .stream()
                .filter(element -> element.getText().contains(text))
                .findFirst()
                .get()
                .click();

    }




}
