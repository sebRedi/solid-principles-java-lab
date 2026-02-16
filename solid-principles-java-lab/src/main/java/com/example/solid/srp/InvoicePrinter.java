package com.example.solid.srp;

public class InvoicePrinter {

    private InvoiceCalculator calculator;

    public InvoicePrinter(InvoiceCalculator calculator) {
        this.calculator = calculator;
    }

    public void print(Invoice invoice) {
        System.out.println("Factura para: " + invoice.getCustomer());
        System.out.println("Total: " + calculator.calculateTotal(invoice));
    }
}
