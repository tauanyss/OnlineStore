package com.company.models;

public class LineItem {
    private String name;

    private int quantity;

    private double price;

    LineItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }
}
