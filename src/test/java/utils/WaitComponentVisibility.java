package utils;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.Constants.SLEEP_TIME;

public class WaitComponentVisibility {

    private static WebDriverWait wait;

    public static WebDriverWait getInstance(){
        if(wait == null){
            wait = new WebDriverWait(DriverFactory.getInstance(), 6);
        }
        return wait;
    }

    public static void waitVisibilityOf(AndroidElement androidElement){
        try {
            Thread.sleep(SLEEP_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            getInstance().until(ExpectedConditions.visibilityOf(androidElement));
        }
    }

}
