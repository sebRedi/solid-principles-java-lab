package com.example.solid.lsp;

public class ElectricCar implements Drivable, Chargeable {

    @Override
    public void drive() {
        System.out.println("Conduciendo...");
    }

    @Override
    public void charge() {
        System.out.println("Cargando batería...");
    }
}
