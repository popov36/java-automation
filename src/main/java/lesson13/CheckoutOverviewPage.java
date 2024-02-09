package lesson13;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

import io.qameta.allure.Step;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Accessors(fluent = true)
@NoArgsConstructor
public class CheckoutOverviewPage {


    private final SelenideElement itemsPrice = $("#checkout_summary_container > div > div.summary_info > div.summary_subtotal_label");
    private final SelenideElement tax = $("#checkout_summary_container > div > div.summary_info > div.summary_tax_label");
    private final SelenideElement totalSum = $("#checkout_summary_container > div > div.summary_info > div.summary_info_label.summary_total_label");
    private final SelenideElement finishButton = $("#finish");

    public String getItemsPrice() {

        return itemsPrice.getText();

    }
    @Step ("Get tax")
    public String getTax() {

        return tax.getText();

    }
    @Step("Finish button click")
    public void finishButtonClick() {

        finishButton.click();

    }


}
