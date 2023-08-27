package com.oop.inheritance.studentHD;

public class Address {
    String addressLine;
    String city;
    String state;
    int zip;


    public Address(String addressLine, String city, String state, int zip) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    public String getAddressLine() {
        return addressLine;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }
}
