package com.oop.medium.address;

public class AddressDemo {
    public static void main(String[] args) {
        Address address = new Address();

        // Setting address details using setter methods
        address.setAddressLine("8231 Ranchview Dr");
        address.setCity("Irving");
        address.setZip(75063);
        address.setState("Texas");

        // Displaying address details using getter methods
        System.out.println("Address Line : " + address.getAddressLine());
        System.out.println("City : " + address.getCity());
        System.out.println("Zip code : " + address.getZip());
        System.out.println("State : " + address.getState());
    }
}

