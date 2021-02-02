package com.epam.modulefive.tasktwo;

import java.util.*;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 */

public class Payment {
    static int numOfPayment;
    private List<Product> products = new ArrayList<>();

            private class Product {
                public Product(String productName, int price) {
                    this.productName = productName;
                    this.price = price;
                }

                String productName;
                int price;

                public String getProductName() {
                    return productName;
                }

                public int getPrice() {
                    return price;
                }

                public void setProductName(String productName) {
                    this.productName = productName;
                }

                public void setPrice(int price) {
                    this.price = price;
                }
            }


    public void buyGoods(String nameProduct, int priceCents) {
        Product product = new Product(nameProduct, priceCents);
        products.add(product);
    }

    private int summaTotal;
    private void printCheck() {
        numOfPayment++;
        System.out.println("check # " + numOfPayment);
        Calendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println("--------------------");
        int itemNumber = 0;
        for (Product p: products) {
            itemNumber++;
            System.out.println(itemNumber + ") " + p.getProductName() + " " + p.getPrice() + " cents");
            summaTotal += p.getPrice();
        }
        System.out.println("--------------------");
        System.out.println("total price: " + summaTotal);
    }

    public void askToPrintCheck() {
        printCheck();
    }


}
