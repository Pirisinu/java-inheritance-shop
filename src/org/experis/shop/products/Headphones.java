package org.experis.shop.products;

import org.experis.shop.Prodotto;

import java.math.BigDecimal;

public class Headphones extends Prodotto {
    public Headphones(String name, String brand, BigDecimal price, BigDecimal vat) {
        super(name, brand, price, vat);
    }
}
