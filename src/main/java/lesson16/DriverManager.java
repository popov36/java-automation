package lesson16;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static AndroidDriver driver;
    private static URL url;

    private DriverManager() {
    }

    public static AndroidDriver getDriver() {
        if (driver == null) {
            try {
                url = new URL("http://127.0.0.1:4723/wd/hub");

                DesiredCapabilities capabilities = getDesiredCapabilities();

                driver = new AndroidDriver(url, capabilities);
                driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            } catch (MalformedURLException e) {
                throw new RuntimeException("Failed to create AndroidDriver. Reason: " + e.getMessage(), e);
            }
        }
        return driver;
    }

    private static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "27e2c8e4f61c7ece");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.gm");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.gm.ConversationListActivityGmail");
        return capabilities;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}


