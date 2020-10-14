package steps;

import entities.Product;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.ProductPage;

public class ProductRegistration {

    private MainPage mainPage;
    private ProductPage productPage;
    private Product expectedProduct;

    @Before
    public void setup(){
        mainPage = new MainPage();
        productPage = new ProductPage();
    }

    @Given("Product needs to be registered")
    public void productNeedsToBeRegistered() {
        mainPage.clickBtnCreateProduct();
    }

    @When("Register the product with all fields")
    public void registerTheProductWithAllFields() {
        expectedProduct = new Product("1", "Apple", "10", 1.0, 2.0, "123");
        productPage.setCode(expectedProduct.getCode());
        productPage.setDescription(expectedProduct.getDescription());
        productPage.setPacking(expectedProduct.getPacking());
        productPage.setAmount(expectedProduct.getAmount());
        productPage.setUnitValue(expectedProduct.getUnitValue());
        productPage.setLot(expectedProduct.getLot());
        productPage.clickDatePicker();
        productPage.setMonthPeriod();
        productPage.clickBtnSaveDate();
        productPage.clickBtnSaveProduct();
    }

    @When("Register the product with required fields")
    public void registerTheProductWithRequiredFields() {
        expectedProduct = new Product("Watermelon", 2.0, 20.0);
        productPage.setDescription(expectedProduct.getDescription());
        productPage.setAmount(expectedProduct.getAmount());
        productPage.setUnitValue(expectedProduct.getUnitValue());
        productPage.clickDatePicker();
        productPage.setMonthPeriod();
        productPage.clickBtnSaveDate();
        productPage.clickBtnSaveProduct();
    }

    @Then("Product is registered successfully")
    public void productIsRegisteredSuccessfully() {
        Assert.assertEquals(mainPage.getTxtProdCode(), expectedProduct.getCode());
        Assert.assertEquals(mainPage.getTxtProdDescription(), expectedProduct.getDescription());
        Assert.assertEquals(mainPage.getTxtProdPacking(), expectedProduct.getPacking());
        Assert.assertEquals(mainPage.getTxtProdAmount(), expectedProduct.getAmount());
        Assert.assertEquals(mainPage.getTxtProdUnityValue(), expectedProduct.getUnitValue());
        Assert.assertEquals(mainPage.getTxtProdLot(), expectedProduct.getLot());
    }

    @Given("Product must be edited")
    public void productMustBeEdited() {
        mainPage.clickBtnCreateProduct();
        expectedProduct = new Product("P-10", "Iohone", "10", 1.0, 2.0, "123");
        productPage.setCode(expectedProduct.getCode());
        productPage.setDescription(expectedProduct.getDescription());
        productPage.setPacking(expectedProduct.getPacking());
        productPage.setAmount(expectedProduct.getAmount());
        productPage.setUnitValue(expectedProduct.getUnitValue());
        productPage.setLot(expectedProduct.getLot());
        productPage.clickDatePicker();
        productPage.setMonthPeriod();
        productPage.clickBtnSaveDate();
        productPage.clickBtnSaveProduct();
    }

    @When("User change product code")
    public void userChangeProductCode() {
        mainPage.clickBtnEdit();
        expectedProduct.setCode("P-11");
        productPage.setCode(expectedProduct.getCode());
    }

    @And("description")
    public void description() {
        expectedProduct.setDescription("Iphone");
        productPage.setDescription(expectedProduct.getDescription());
        productPage.clickBtnSaveProduct();
    }

    @Then("check it was updated")
    public void checkItWasUpdated() {
        Assert.assertEquals(mainPage.getTxtProdCode(), expectedProduct.getCode());
        Assert.assertEquals(mainPage.getTxtProdDescription(), expectedProduct.getDescription());
    }

    @After
    public void endTest(){
        mainPage.clickBtnDelete();
        mainPage.clickConfirmDeleteProductDialog();
    }

}
