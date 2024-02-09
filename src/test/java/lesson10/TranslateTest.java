package lesson10;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class TranslateTest {

    @BeforeClass
    public void setUp() {

        Configuration.timeout = 5000;
        open("https://translate.google.com/?sl=uk&tl=en&op=translate");

    }

    @Test(dataProvider = "languages")
    @Feature("Translations")
    @Description("Google Translation Test")
    @Owner("Denis Popov")
    @Link(name = "Google Translate", url = "https://translate.google.com/")
    @Severity(SeverityLevel.NORMAL)
    public void testGoogleTranslate(String language, String translation) {



        $x("//*[contains(@class,'er8xn')]").should(appear).setValue("Я круто вивчу ТестНГ");
        $("#yDmH0d > c-wiz > div > div.ToWKne > c-wiz > div.OlSOob > c-wiz > div.ccvoYb.EjH7wc > div.aCQag > c-wiz > div.zXU7Rb > c-wiz > div:nth-child(5) > button > div.VfPpkd-Bz112c-RLmnJb").should(appear).click();

        $$x("//*[contains(@class,'Llmcnf')]")
                .filter(Condition.text(language))
                .get(0).click();


        $x("//*[contains(@class,'HwtZe')]").shouldHave(text(translation));


    }

    @DataProvider(name = "languages")
    public Object[][] languages() {
        return new Object[][]{
                {"English", "I will learn TestNG cool"},
                {"Bulgarian", "Ще проуча тестването"},
                {"Chinese (Traditional)", "我將研究測試"},
                {"Czech", "Naučím se TestNG v pohodě"},
                {"Danish", "Jeg vil studere testen"},
                {"Dutch", "Ik zal TestNG cool leren"},
                {"French", "J'apprendrai TestNG cool"},
                {"Georgian", "ტესტირებას შევისწავლები "},
                {"German", "Ich werde TestNG cool lernen"},
                {"Irish", "Foghlaimeoidh mé TestNG fionnuar"},
                {"Italian", "Imparerò il TestNG alla grande"},
                {"Japanese", "TestNGをかっこよく学びます"},
                {"Korean", "TestNG 멋지게 배워보겠습니다"},
                {"Latin", "Discam TestNG frigus"},
                {"Malay", "Saya akan belajar TestNG sejuk"},
                {"Polish", "Nauczę się TestNG cool"},
                {"Portuguese", "Vou aprender TestNG legal"},
                {"Serbian", "Научићу ТестНГ цоол"},
                {"Slovak", "Naučím sa TestNG v pohode"},
                {"Spanish", "Aprenderé TestNG genial"}
        };
    }

}
