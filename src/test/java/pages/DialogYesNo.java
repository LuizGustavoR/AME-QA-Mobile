package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.WaitComponentVisibility;

public class DialogYesNo {

    @FindBy(id = "android:id/button1")
    public AndroidElement btnYes;

    public DialogYesNo() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.getInstance()), this);
    }

    public void clickBtnYes(){
        WaitComponentVisibility.waitVisibilityOf(btnYes);
        btnYes.click();
    }

}
