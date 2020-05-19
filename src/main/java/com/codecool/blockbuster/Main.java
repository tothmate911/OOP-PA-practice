package com.codecool.blockbuster;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product product1 = new Product();
        Product product2 = new Product();

        store.addProduct(product1);
        store.addProduct(product2);
    }
}
