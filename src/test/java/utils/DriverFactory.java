package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static utils.Constants.FILE_PATH;

public class DriverFactory {

    private static URL url;
    private static DesiredCapabilities capabilities;
    private static AppiumDriver<AndroidElement> driver;
    private static final String URL_STRING = "http://127.0.0.1:4723/wd/hub";

    public static AppiumDriver<AndroidElement> getInstance(){

        if(driver == null){

            try {
                url = new URL(URL_STRING);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            String absolutePath = new File(FILE_PATH + "product_registration.apk").getAbsolutePath();

            capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_API_28_Pie");
            capabilities.setCapability(MobileCapabilityType.APP, absolutePath);
            capabilities.setCapability("autoGrantPermissions", true);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            capabilities.setCapability("unicodeKeyboard", true);

            driver = new AndroidDriver(url, capabilities);
//            driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        }

        return driver;

    }

}
