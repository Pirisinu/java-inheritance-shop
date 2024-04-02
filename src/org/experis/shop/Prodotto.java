package org.experis.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    // Attributes
    private int code;
    private String name, brand;
    BigDecimal price , vat;
    DecimalFormat euroFormatter = new DecimalFormat("0.00 €");

    // Constructor
    public Prodotto(String name, String brand, BigDecimal price, BigDecimal vat) {
        Random rand = new Random();
        this.code = rand.nextInt(1000) + 1;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }

    // Methods
    public BigDecimal getVatPrice(){
        return price.add(price.divide(new BigDecimal(100)).multiply(vat)).setScale(2, RoundingMode.HALF_EVEN);
    }

    public String getFullInfo(){
        String fullInfo = "Product n°" + this.code + " || "
                + "Name: " + this.name + " || "
                + "Brand: " + this.brand + " || "
                + "Original price: " + euroFormatter.format(this.price) + " || "
                + "Vat price: " + euroFormatter.format(getVatPrice()) + " || ";

        return fullInfo;
    }


    // Getters and Setters
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }
}
