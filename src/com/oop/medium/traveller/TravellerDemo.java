package com.oop.medium.traveller;

public class TravellerDemo {
    public static void main(String[] args) {
        Traveller traveller = new Traveller();
        TravellerCheck check = new TravellerCheck();
        traveller.setTravellerId(1001);
        traveller.setBaggageAmount(55000);
        traveller.setExpiryYear(1999);
        traveller.setNocStatus(false);
        boolean baggageCheck = check.checkBaggage(traveller);
        boolean immigrationCheck = check.checkImmigration(traveller);
        boolean securityCheck = check.checkSecurity(traveller);
        if (baggageCheck && immigrationCheck && securityCheck) {
            System.out.println("Allow Traveller to Fly!");
        } else {
            System.out.println("Detain Traveller for Re-checking!");
        }
    }
}
