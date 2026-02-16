package com.example.solid.dip;

public class FileDatabase implements Database {

    @Override
    public void saveOrder() {
        System.out.println("Guardando pedido en archivo...");
    }
}
