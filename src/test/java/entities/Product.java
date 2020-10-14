package entities;

import static io.cucumber.messages.internal.com.google.common.base.Strings.nullToEmpty;

public class Product {

    private String code;
    private String description;
    private String packing;
    private Double amount;
    private Double unitValue;
    private String lot;

    public Product(String code, String description, String packing, Double amount, Double unitValue, String lot) {
        this.code = code;
        this.description = description;
        this.packing = packing;
        this.amount = amount;
        this.unitValue = unitValue;
        this.lot = lot;
    }

    public Product(String description, Double amount, Double unitValue) {
        this.description = description;
        this.amount = amount;
        this.unitValue = unitValue;
    }

    public String getCode() {
        return nullToEmpty(code);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return nullToEmpty(description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPacking() {
        return nullToEmpty(packing);
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(Double unitValue) {
        this.unitValue = unitValue;
    }

    public String getLot() {
        return nullToEmpty(lot);
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

}
