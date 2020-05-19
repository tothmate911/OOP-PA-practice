package com.codecool.blockbuster;

import java.util.LinkedList;
import java.util.List;

public class Store {
    private List<Product> products = new LinkedList<>();
    private int inCome;

    public void simulateADay() {

        for (Product product : products) {


        }
    }

    public void simulateAMonth() {
        for (int i = 0; i < 30; i++) {
            simulateADay();
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
