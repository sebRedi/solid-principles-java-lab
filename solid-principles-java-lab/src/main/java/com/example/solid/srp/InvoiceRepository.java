package com.example.solid.srp;

public class InvoiceRepository {

    public void save(Invoice invoice) {
        System.out.println("Guardando factura del cliente " + invoice.getCustomer());
    }
}
