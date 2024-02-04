package lesson13;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class PageObjectPatternTest {


    private final LoginPage loginPage = new LoginPage();
    private final ProductPage productPage = new ProductPage();
    private final CartPage cartPage = new CartPage();
    private final CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();
    private final CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    private final CompletePage completePage = new CompletePage();

    @BeforeClass
    public void setUp() {

        Configuration.timeout = 10000;
        open("https://www.saucedemo.com/");

    }


    @Test(enabled = false)
    public void invalidLogin() {

        loginPage.setLogin("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
        loginPage.checkErrorMessage();

    }

    @Test
    public void SuccessPurchase() {

        loginPage.setLogin("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
        productPage.addToCartProduct2();
        productPage.addToCartProduct5();
        productPage.clickCartButton();
        cartPage.checkItem1Name();
        cartPage.checkItem2Name();
        cartPage.checkoutButtonClick();
        checkoutInformationPage.setFirstName("Denis");
        checkoutInformationPage.setLastName("Popov");
        checkoutInformationPage.setPostalCode("90210");
        checkoutInformationPage.clickContinueButton();
        String tax = checkoutOverviewPage.getTax();
        System.out.println(tax);
        checkoutOverviewPage.finishButtonClick();
        completePage.checkThankYouTitle();

        Selenide.sleep(5000);


    }

}
