package pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import utils.WaitComponentVisibility;

public class MainPage {

    @FindBy(id = "Button1")
    public AndroidElement btnCreateProduct;

    @FindBy(id = "br.com.pztec.estoque:id/txt_idprod")
    public AndroidElement txtProdId;

    @FindBy(id = "br.com.pztec.estoque:id/txt_codigo")
    public AndroidElement txtProdCod;

    @FindBy(id = "br.com.pztec.estoque:id/txt_descricao")
    public AndroidElement txtProdDescription;

    @FindBy(id = "br.com.pztec.estoque:id/txt_unidade")
    public AndroidElement txtProdPacking;

    @FindBy(id = "br.com.pztec.estoque:id/txt_quantidade")
    public AndroidElement txtProdAmount;

    @FindBy(id = "br.com.pztec.estoque:id/txt_valunit")
    public AndroidElement txtProdUnityValue;

    @FindBy(id = "br.com.pztec.estoque:id/txt_lote")
    public AndroidElement txtProdLot;

    @FindBy(id = "deletar")
    public AndroidElement btnDelete;

    @FindBy(id = "editar")
    public AndroidElement btnEdit;

    private DialogYesNo dialogYesNo;

    public MainPage() {
        dialogYesNo = new DialogYesNo();
        PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.getInstance()), this);
    }

    public void clickBtnCreateProduct(){
        WaitComponentVisibility.waitVisibilityOf(btnCreateProduct);
        btnCreateProduct.click();
    }

    public String getTxtProdId() {
        WaitComponentVisibility.waitVisibilityOf(txtProdId);
        return txtProdId.getText();
    }

    public String getTxtProdCode() {
        WaitComponentVisibility.waitVisibilityOf(txtProdCod);
        return txtProdCod.getText();
    }

    public String getTxtProdDescription() {
        WaitComponentVisibility.waitVisibilityOf(txtProdDescription);
        return txtProdDescription.getText();
    }

    public String getTxtProdPacking() {
        WaitComponentVisibility.waitVisibilityOf(txtProdPacking);
        return txtProdPacking.getText();
    }

    public Double getTxtProdAmount() {
        WaitComponentVisibility.waitVisibilityOf(txtProdAmount);
        return Double.parseDouble(txtProdAmount.getText().replaceAll(",", "."));
    }

    public Double getTxtProdUnityValue() {
        WaitComponentVisibility.waitVisibilityOf(txtProdUnityValue);
        return Double.parseDouble(txtProdUnityValue.getText().replaceAll(",", "."));
    }

    public String getTxtProdLot() {
        WaitComponentVisibility.waitVisibilityOf(btnDelete);
        return txtProdLot.getText();
    }

    public void clickBtnDelete(){
        WaitComponentVisibility.waitVisibilityOf(btnDelete);
        btnDelete.click();
    }

    public void clickBtnEdit(){
        WaitComponentVisibility.waitVisibilityOf(btnEdit);
        btnEdit.click();
    }

    public void clickConfirmDeleteProductDialog(){
        dialogYesNo.clickBtnYes();
    }

}
