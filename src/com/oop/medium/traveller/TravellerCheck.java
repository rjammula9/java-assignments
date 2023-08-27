package com.oop.medium.traveller;

public class TravellerCheck {
    public boolean checkBaggage(Traveller traveller) {
        return traveller.getBaggageAmount() >= 0 && traveller.getBaggageAmount() <= 40;
    }

    public boolean checkImmigration(Traveller traveller) {
        return traveller.getExpiryYear() >= 2001 && traveller.getExpiryYear() <= 2025;
    }

    public boolean checkSecurity(Traveller traveller) {
        return traveller.getNocStatus();
    }
}
