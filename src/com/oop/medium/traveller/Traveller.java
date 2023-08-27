package com.oop.medium.traveller;

public class Traveller {
    private int travellerId;
    private int baggageAmount;
    private int expiryYear;
    private boolean nocStatus;

    public Traveller() {
        this.travellerId = travellerId;
        this.baggageAmount = baggageAmount;
        this.expiryYear = expiryYear;
        this.nocStatus = nocStatus;
    }

    public void setTravellerId(int travellerId) {
        this.travellerId = travellerId;
    }

    public void setBaggageAmount(int baggageAmount) {
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public void setNocStatus(boolean nocStatus) {
        this.nocStatus = nocStatus;
    }

    public int getTravellerId() {
        return travellerId;
    }

    public int getBaggageAmount() {
        return baggageAmount;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public boolean getNocStatus() {
        return nocStatus;
    }

}
