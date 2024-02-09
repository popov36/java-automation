package lesson13;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

import io.qameta.allure.Step;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Accessors(fluent = true)
@NoArgsConstructor
public class CheckoutInformationPage {

    private final SelenideElement firstNameField = $("#first-name");
    private final SelenideElement lastNameField = $("#last-name");
    private final SelenideElement postalCodeField = $("#postal-code");
    private final SelenideElement continueButton = $("#continue");

    @Step("Set first name")
    public void setFirstName(String firstname) {

        firstNameField.setValue(firstname);

    }
    @Step("Set last name")
    public void setLastName(String lastname) {

        lastNameField.setValue(lastname);

    }
    @Step("Set postal code")
    public void setPostalCode(String postalCode) {

        postalCodeField.setValue(postalCode);

    }
    @Step("Click on continue")
    public void clickContinueButton() {

        continueButton.click();

    }
}
