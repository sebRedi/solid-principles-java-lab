package com.example.solid.ocp;

public class DiscountCalculator {

    public double calculateDiscount(double price, DiscountStrategy strategy) {
        return strategy.calculate(price);
    }
}
