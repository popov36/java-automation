package lesson13;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;



@Accessors(fluent = true)
@NoArgsConstructor
public class LoginPage {

    private final SelenideElement userNameField = $("#user-name");
    private final SelenideElement passwordField = $("#password");
    private final SelenideElement loginButton = $("#login-button");
    private final SelenideElement errorMessage = $("#.error-message-container.error");


    public void setLogin(String username) {

        userNameField.setValue(username);

    }

    public void setPassword(String password) {

        passwordField.setValue(password);

    }

    public void clickLoginButton() {

        loginButton.click();

    }

    public void checkErrorMessage() {

        errorMessage.shouldBe(Condition.visible);

    }


}
