package org.experis.shop.products;

import org.experis.shop.Prodotto;

import java.math.BigDecimal;

public class Televisions extends Prodotto {
    public Televisions(String name, String brand, BigDecimal price, BigDecimal vat) {
        super(name, brand, price, vat);
    }
}
