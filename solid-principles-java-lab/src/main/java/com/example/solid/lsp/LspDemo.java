package com.example.solid.lsp;

public class LspDemo {

    public static void main(String[] args) {
        Drivable car1 = new GasCar();
        Drivable car2 = new ElectricCar();

        car1.drive();
        car2.drive();

        Fuelable gasOnly = new GasCar();
        gasOnly.refuel();

        Chargeable electricOnly = new ElectricCar();
        electricOnly.charge();
    }
}
