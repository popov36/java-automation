package lesson16;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
public class BasePage {

    public WebDriver driver;

    public BasePage() throws MalformedURLException {
        driver = DriverManager.createDriver();
        PageFactory.initElements(driver, this);
    }

}
