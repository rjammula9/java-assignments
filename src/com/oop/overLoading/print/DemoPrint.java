package com.oop.overLoading.print;

public class DemoPrint {

        public static void main(String[] args) {
            PrintDetails printDetails = new PrintDetails();

            printDetails.printHeader('*');
            printDetails.printHeader('Z', 20);
            printDetails.printHeader("University of Dallas");
        }


}
