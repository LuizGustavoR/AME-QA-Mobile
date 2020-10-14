package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.WaitComponentVisibility;

public class ProductPage {

    @FindBy(id = "txt_codigo")
    public AndroidElement txtCode;

    @FindBy(id = "txt_descricao")
    public AndroidElement txtDescription;

    @FindBy(id = "txt_unidade")
    public AndroidElement txtPacking;

    @FindBy(id = "txt_quantidade")
    public AndroidElement txtAmount;

    @FindBy(id = "txt_valunit")
    public AndroidElement txtUnitValue;

    @FindBy(id = "txt_lote")
    public AndroidElement txtLot;

    @FindBy(id = "data")
    public AndroidElement datePicker;

    @FindBy(id = "btn_gravar_assunto")
    public AndroidElement btnSave;

    private DatePickerPage datePickerPage;

    public ProductPage() {
        datePickerPage = new DatePickerPage();
        PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.getInstance()), this);
    }

    public void setCode(String code){
        WaitComponentVisibility.waitVisibilityOf(txtCode);
        txtCode.clear();
        txtCode.sendKeys(code);
    }

    public void setDescription(String code){
        WaitComponentVisibility.waitVisibilityOf(txtDescription);
        txtDescription.clear();
        txtDescription.sendKeys(code);
    }

    public void setPacking(String packing){
        WaitComponentVisibility.waitVisibilityOf(txtPacking);
        txtPacking.clear();
        txtPacking.sendKeys(packing);
    }

    public void setAmount(Double amount){
        WaitComponentVisibility.waitVisibilityOf(txtAmount);
        txtAmount.clear();
        txtAmount.sendKeys(String.valueOf(amount));
    }

    public void setUnitValue(Double value){
        WaitComponentVisibility.waitVisibilityOf(txtUnitValue);
        txtUnitValue.clear();
        txtUnitValue.sendKeys(String.valueOf(value));
    }

    public void setLot(String lot){
        WaitComponentVisibility.waitVisibilityOf(txtLot);
        txtLot.clear();
        txtLot.sendKeys(String.valueOf(lot));
    }

    public void clickDatePicker(){
        WaitComponentVisibility.waitVisibilityOf(datePicker);
        datePicker.click();
    }

    public void setMonthPeriod(){
        datePickerPage.setMonthPeriod();
    }

    public void clickBtnSaveDate(){
        datePickerPage.clickBtnOk();
    }

    public void clickBtnSaveProduct(){
        WaitComponentVisibility.waitVisibilityOf(btnSave);
        btnSave.click();
    }

}
