package com.example.solid.dip;

public class DipDemo {

    public static void main(String[] args) {
        Database database = new MySQLDatabase();
        OrderProcessor processor = new OrderProcessor(database);

        processor.processOrder();
    }
}
