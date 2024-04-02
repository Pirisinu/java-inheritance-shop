package org.experis.shop.products;


import org.experis.shop.Prodotto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Prodotto {
    // Attributes
    private long  IMEICode;
    private int memoryGB;

    // Constructor
    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat, long  IMEICode ,int memoryGB) {
        super(name, brand, price, vat);
        this.IMEICode = IMEICode;
        this.memoryGB = memoryGB;
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
                + "Vat price: " + this.getEuroFormatter().format(getVatPrice()) + " || ";
    }
}
