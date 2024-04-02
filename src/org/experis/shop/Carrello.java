package org.experis.shop;

import org.experis.shop.products.Headphones;
import org.experis.shop.products.Smartphone;
import org.experis.shop.products.Televisions;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean exit = false;
        Prodotto[] productList = null;

        do {
            // Intro + regole
            System.out.println();
            System.out.println("ROULES: select with number");
            System.out.println();
            System.out.println("Benvenuto nello shop Java!");

            // Array di prodotti
            System.out.println("Quanti prodotti vuoi inserire??");
            byte productListLength = Byte.parseByte(scan.nextLine());
            productList = new Prodotto[productListLength];

            for (int i = 0; i < productList.length; i++) {
                System.out.print("Scegli cosa inserire: ");
                System.out.print("1) Smartphone ");
                System.out.print("2) Television ");
                System.out.println("3) Headphones ");
                byte choice = Byte.parseByte(scan.nextLine());
                System.out.print("Nome: ");
                String name = scan.nextLine();
                System.out.print("Brand: ");
                String brand = scan.nextLine();
                System.out.print("Price: ");
                String price = scan.nextLine();
                System.out.print("Vat: ");
                String vat = scan.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("IMEI Code: ");
                        long imeiCode = Long.parseLong(scan.nextLine());
                        System.out.print("Memory in GB: ");
                        int memGb = Integer.parseInt(scan.nextLine());
                        productList[i] = new Smartphone(name, brand, new BigDecimal(price), new BigDecimal(vat), imeiCode, memGb);
                        break;
                    case 2:
                        System.out.print("Dimensions: ");
                        String dim = scan.nextLine();
                        System.out.print("Is Smart? (Y/N)");
                        boolean isSmart = scan.nextLine().equalsIgnoreCase("Y");
                        productList[i] = new Televisions(name, brand, new BigDecimal(price), new BigDecimal(vat), dim, isSmart);
                        break;
                    case 3:
                        System.out.print("Color: ");
                        String color = scan.nextLine();
                        System.out.print("Is Wireless? (Y/N)");
                        boolean isWireless = scan.nextLine().equalsIgnoreCase("Y");
                        productList[i] = new Headphones(name, brand, new BigDecimal(price), new BigDecimal(vat), color, isWireless);
                        break;
                    default:
                        System.out.println("Scelta non valida. Scegli uno dei tre prodotti.");
                        break;
                }
            }
            //Stampo il carrello
            printCart(productList);

            System.out.println("Vuoi continuare a comprare? (Y/N)");
            exit = scan.nextLine().equalsIgnoreCase("N");

        } while (!exit);
        System.out.println("Grazie e arrivederci");
    }

    private static void printCart(Prodotto[] productList) {
        System.out.println("------ Carrello ------");
        for (Prodotto product : productList) {
            System.out.println(product.getFullInfo());
        }
        System.out.println("----------------------");
    }
}
