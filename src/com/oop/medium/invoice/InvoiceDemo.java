package com.oop.medium.invoice;

public class InvoiceDemo {

    public static void main(String[] args) {
        // Create an Invoice object
        Invoice invoice = new Invoice("12345", "Hammer", 5, 9.99);

        // Display the initial invoice information
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());

        // Update the invoice information
        invoice.setQuantity(10);
        invoice.setPricePerItem(12.49);

        // Display the updated invoice information
        System.out.println("\nUpdated Quantity: " + invoice.getQuantity());
        System.out.println("Updated Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Updated Invoice Amount: $" + invoice.getInvoiceAmount());
    }


}
