package com.example.solid.ocp;

public class OcpDemo {

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        double regular = calculator.calculateDiscount(100, new RegularDiscount());
        double vip = calculator.calculateDiscount(100, new VipDiscount());

        System.out.println("Regular discount: " + regular);
        System.out.println("VIP discount: " + vip);
    }
}
