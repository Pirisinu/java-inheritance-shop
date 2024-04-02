package org.experis.shop.products;


import org.experis.shop.Prodotto;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat) {
        super(name, brand, price, vat);
    }
}
