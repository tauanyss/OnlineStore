package com.company;

import com.company.models.LineItem;
import com.company.models.Store;

public class Main {

    /*
     * Main Class
     * Simple test case to check if the code is properly running.
     */
    public static void main(String[] args) {
        Store store = new Store();
        store.addItemToStore("laptop", 500);
        store.addItemToStore("laptop", 700);
        store.addItemToStore("keyboard", 50);
        store.addItemToStore("headset", 20);
        store.addItemToCart("laptop", 2);
        store.addItemToCart("laptop", 3);
        store.addItemToCart("headset", 3);
        store.addItemToCart("keyboard", 1);
        store.addItemToCart("mouse", 5);

        LineItem[] items = store.getCartItems();
        for (LineItem item : items) {
            System.out.printf("Item: %s - Quantity: %s - Price: $%.2f%n", item.getName(), item.getQuantity(), item.getPrice());
        }
        double total = store.getCartTotal();
        System.out.printf("Total value: $%.2f%n", total);
    }
}
