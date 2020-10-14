package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.WaitComponentVisibility;

public class DatePickerPage {

    @FindBy(id = "android:id/date_picker_header_year")
    public AndroidElement btnYearPicker;

    @FindBy(id = "android:id/date_picker_header_date")
    public AndroidElement btnDatePicker;

    @FindBy(id = "android:id/prev")
    public AndroidElement btnPrevMonth;

    @FindBy(id = "android:id/next")
    public AndroidElement btnNextMonth;

    @FindBy(id = "android:id/button1")
    public AndroidElement btnOk;

    @FindBy(id = "android:id/txt_descricao")
    public AndroidElement txtDescription;

    public DatePickerPage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.getInstance()), this);
    }

    public void setMonthPeriod(){
        WaitComponentVisibility.waitVisibilityOf(btnNextMonth);
        btnNextMonth.click();
    }

    public void clickBtnOk(){
        WaitComponentVisibility.waitVisibilityOf(btnOk);
        btnOk.click();
    }

}
