package com.javaLang.strings2;

public class DemoAddress {
    public static void main(String[] args){
        Address address=new Address();
        address.setAddressLine("8231 Ranchview Dr");
        address.setCity("Irving");
        address.setZip("75063");
        address.setState("Texas");
        System.out.println("Address Line:"+address.getAddressLine());
        System.out.println("City:"+address.getCity());
        System.out.println("Zip Code:"+address.getZip());
        System.out.println("State:"+address.getState());
    }
}
