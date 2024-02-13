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

//    private static Logger LOG = Logger.getLogger(DriverManager.class.getName());
    private static DesiredCapabilities capabilities = new DesiredCapabilities();
    private static URL url;
    static AndroidDriver driver;

    static {
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private DriverManager() {
    }

    public static AndroidDriver createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        LOG.info("Create new driver");
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "27e2c8e4f61c7ece");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.gm");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.gm.ConversationListActivityGmail");


        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
//    private static DesiredCapabilities getCapabilities() {
//
//        capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "27e2c8e4f61c7ece");
//        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.gm");
//        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.gm.ConversationListActivityGmail");
//        return capabilities;
//
//
//    }




//    public static AndroidDriver getDriver() throws MalformedURLException {
//
//        public WebDriver createDriver() {
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            LOG.info("Create new driver");
//            capabilities = new DesiredCapabilities();
//            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
//            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.gm");
//            capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.gm.ConversationListActivityGmail");
//
//
//            try {
//                return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//            } catch (MalformedURLException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }


//    public static void setCapabilities() throws MalformedURLException {
//        driver = new AndroidDriver(url, getCapabilities());
//
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//    }

    public static void closeDriver() throws MalformedURLException {
        createDriver().quit();
    }

}
