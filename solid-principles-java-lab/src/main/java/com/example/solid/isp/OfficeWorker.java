package com.example.solid.isp;

public class OfficeWorker implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Haciendo tareas de oficina...");
    }

    @Override
    public void eat() {
        System.out.println("Almorzando...");
    }
}
