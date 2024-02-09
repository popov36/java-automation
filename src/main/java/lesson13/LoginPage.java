package lesson13;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

import io.qameta.allure.Step;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;



@Accessors(fluent = true)
@NoArgsConstructor
public class LoginPage {

    private final SelenideElement userNameField = $("#user-name");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login-button");
    private final SelenideElement errorMessage = $("#.error-message-container.error");

    @Step("Set login")
    public LoginPage setLogin(String username) {

        userNameField.setValue(username);
        return this;

    }
    @Step("Set password")
    public void setPassword(String password) {

        passwordField.setValue(password);

    }
    @Step("Click login button")
    public void clickLoginButton() {

        loginButton.click();

    }
    @Step("Check error")
    public void checkErrorMessage() {

        errorMessage.shouldBe(Condition.visible);

    }


}
