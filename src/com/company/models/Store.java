package com.company.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {
    private Cart cart;

    private List<LineItem> storeItems;

    public Store() {
        this.cart = new Cart();
        this.storeItems = new ArrayList<>();
    }

    /*
     * Add item with given unique name (ID) and quantity into
     * cart. Name is case-sensitive.
     */
    public void addItemToCart(String name, int quantity) {
        LineItem storeItem = containsItem(storeItems, name);
        if (storeItem != null) {
            storeItem.addQuantity(quantity);
            LineItem cartItem = containsItem(cart.getCartItems(), name);
            if (cartItem == null) {
                cart.addItem(storeItem);
            }
        } else {
            System.out.printf("The item '%s' doesn't exist in the store.%n", name);
        }
    }

    /*
     * Add item with given unique name (ID) and price into store
     * inventory. Name is case-sensitive.
     */
    public void addItemToStore(String name, double price) {
        LineItem storeItem = containsItem(storeItems, name);
        if (storeItem == null){
            storeItem = new LineItem(name, price);
            storeItems.add(storeItem);
        } else {
            storeItem.setPrice(price);
        }
    }

    /*
     * Get items in cart, consolidating all duplicate items,
     * ordered by item name (ascending).
     */
    public LineItem[] getCartItems() {
        // Sort the items by name in ascending order.
        cart.getCartItems().sort(Comparator.comparing(LineItem::getName));
        // Convert the ArrayList to an Array.
        LineItem[] itemsArray = new LineItem[cart.getCartItems().size()];
        itemsArray = cart.getCartItems().toArray(itemsArray);
        return itemsArray;
    }

    /*
     * Get total cost of items currently in cart.
     */
    public double getCartTotal() {
        double total = 0;
        for (LineItem cartItem : cart.getCartItems()) {
            total += cartItem.getQuantity() * cartItem.getPrice();
        }
        return total;
    }

    /*
     * Verify if a list of items already contains the item.
     * Return the item if true.
     */
    private LineItem containsItem(List<LineItem> lineItems, String name){
        return lineItems.stream().filter(item -> item.getName().equals(name)).findAny().orElse(null);
    }

}
