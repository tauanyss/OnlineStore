package com.company.models;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<LineItem> cartItems;

    Cart() {
        cartItems = new ArrayList<>();
    }

    void addItem(LineItem cartItem) {
        cartItems.add(cartItem);
    }

    List<LineItem> getCartItems() {
        return cartItems;
    }

}
