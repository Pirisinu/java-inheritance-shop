package org.experis.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    // Attributes
    private int code;
    private String name, brand;
    BigDecimal price , vat;

    // Constructor
    public Prodotto(String name, String brand, BigDecimal price, BigDecimal vat) {
        Random rand = new Random();
        this.code = rand.nextInt(1000) + 1;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
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
