package lesson13;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


@Accessors(fluent = true)
@NoArgsConstructor
public class ProductPage {

    //    private final ElementsCollection productList = $$x("//*[@id=\"inventory_container\"]");
    private final SelenideElement product2Name = $("#item_0_title_link > div");
    private final SelenideElement product5Name = $("#item_2_title_link > div");
    private final SelenideElement addProduct2ToCart = $("#add-to-cart-sauce-labs-bike-light");
    private final SelenideElement addProduct5ToCart = $("#add-to-cart-sauce-labs-onesie");
    private final SelenideElement shoppingCart = $("#shopping_cart_container > a");


//    public void checkProductList(){
//
//        productList.shouldHave(CollectionCondition.size(6));
//
//    }

    public void addToCartProduct2() {

        addProduct2ToCart.click();

    }

    public void addToCartProduct5() {

        addProduct5ToCart.click();

    }

    public void clickCartButton() {

        shoppingCart.click();

    }


}
