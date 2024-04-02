package org.experis.shop.products;

import org.experis.shop.Prodotto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisions extends Prodotto {
    // Attributes
    private String dimensions;
    private boolean isSmart;

    // Constructor
    public Televisions(String name, String brand, BigDecimal price, BigDecimal vat, String dimensions, boolean isSmart) {
        super(name, brand, price, vat);
        this.dimensions = dimensions;
        this.isSmart = isSmart;
    }
    // Methods Override
    @Override
    public BigDecimal getVatPrice(){
        return this.getPrice().add(this.getPrice().divide(new BigDecimal(100)).multiply(this.getVat())).setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String getFullInfo(){
        return "Product n°" + this.getCode() + " || "
                + "Name: " + this.getName() + " || "
                + "Brand: " + this.getBrand() + " || "
                + "Original price: " + this.getEuroFormatter().format(this.getPrice()) + " || "
                + "Vat price: " + this.getEuroFormatter().format(getVatPrice()) + " || "
                + "Dimensions: " + this.dimensions + " || "
                + "Is Smart: " + this.isSmart() + " || "
                ;
    }

    // Getters e Setters


    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public String isSmart() {
        if (isSmart){
            return "Smart device";
        }else return "Not smart device";
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
}
