package org.experis.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello shop");
        Prodotto prodotto1 = new Prodotto("Prodotto", "Generic", new BigDecimal(20), new BigDecimal(50));
        System.out.println(prodotto1.getVatPrice());
        System.out.println(prodotto1.getFullInfo());
    }
}
