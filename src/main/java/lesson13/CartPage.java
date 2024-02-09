package lesson13;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

import io.qameta.allure.Step;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;



@Accessors(fluent = true)
@NoArgsConstructor
public class CartPage {

//    private final ElementsCollection cartItemNames = $$x("//*[@id=\"cart_contents_container\"]/div/div[1]");

    private final SelenideElement pageTitle = $("#header_container > div.header_secondary_container > span");
    private final SelenideElement cartItem1Name = $("#item_0_title_link > div");
    private final SelenideElement cartItem2Name = $("#item_2_title_link > div");
    private final SelenideElement cartItem1Price = $("#cart_contents_container > div > div.cart_list > div:nth-child(3) > div.cart_item_label > div.item_pricebar > div");
    private final SelenideElement cartItem2Price = $("#cart_contents_container > div > div.cart_list > div:nth-child(4) > div.cart_item_label > div.item_pricebar > div");
    private final SelenideElement checkoutButton = $("#checkout");

    @Step("Check $7.99 product name")
    public void checkItem1Name() {

        cartItem1Name.shouldHave(text("Sauce Labs Bike Light"));

    }
    @Step("Check $7.99 product name")
    public void checkItem2Name() {

        cartItem2Name.shouldHave(text("Sauce Labs Onesie"));

    }
    @Step("Click on checkout")
    public void checkoutButtonClick() {

        checkoutButton.click();

    }


}
