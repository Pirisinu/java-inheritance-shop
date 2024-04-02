package org.experis.shop.products;

import org.experis.shop.Prodotto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Headphones extends Prodotto {
    // Attributes
    private String color;
    private boolean isWireless;

    // Constructor
    public Headphones(String name, String brand, BigDecimal price, BigDecimal vat, String color, boolean isWireless) {
        super(name, brand, price, vat);
        this.color = color;
        this.isWireless = isWireless;
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
    // Getters e Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }
}
