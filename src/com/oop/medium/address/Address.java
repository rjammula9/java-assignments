package com.oop.medium.address;

public class Address {
    public String state;
    public String addressLine;
    public String city;
    public int zip;
    public Address(){
        this.addressLine=addressLine;
        this.city=city;
        this.zip=zip;
        this.state=state;
    }

    public Address(String s, String irving, String texas, int i) {
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
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
