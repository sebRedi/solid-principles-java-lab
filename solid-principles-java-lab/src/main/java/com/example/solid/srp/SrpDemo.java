package com.example.solid.srp;

public class SrpDemo {

    public static void main(String[] args) {
        Invoice invoice = new Invoice("Sebastián", 100);

        InvoiceCalculator calculator = new InvoiceCalculator();
        InvoicePrinter printer = new InvoicePrinter(calculator);
        InvoiceRepository repository = new InvoiceRepository();

        printer.print(invoice);
        repository.save(invoice);
    }
}
