package lesson13;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Accessors(fluent = true)
@NoArgsConstructor
public class CompletePage {

    public final SelenideElement thankYouTitle = $("#checkout_complete_container > h2");
    public final SelenideElement backHomeButton = $("#back-to-products");


    public void checkThankYouTitle() {

        thankYouTitle.shouldHave(text("Thank you for your order!"));

    }


}
