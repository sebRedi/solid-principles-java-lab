package com.example.solid.isp;

public class IspDemo {

    public static void main(String[] args) {
        Workable dev = new Developer();
        dev.work();

        OfficeWorker office = new OfficeWorker();
        office.work();
        office.eat();
    }
}
