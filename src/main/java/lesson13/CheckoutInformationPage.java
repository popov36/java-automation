package lesson13;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Accessors(fluent = true)
@NoArgsConstructor
public class CheckoutInformationPage {

    private final SelenideElement firstNameField = $("#first-name");
    private final SelenideElement lastNameField = $("#last-name");
    private final SelenideElement postalCodeField = $("#postal-code");
    private final SelenideElement continueButton = $("#continue");

    public void setFirstName(String firstname) {

        firstNameField.setValue(firstname);

    }

    public void setLastName(String lastname) {

        lastNameField.setValue(lastname);

    }

    public void setPostalCode(String postalCode) {

        postalCodeField.setValue(postalCode);

    }

    public void clickContinueButton() {

        continueButton.click();

    }
}
