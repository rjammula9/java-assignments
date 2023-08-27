package com.oop.simple.ticket;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket(18, 2);
        Ticket ticket3 = new Ticket(2, 18);
        displayTicketDetails(ticket1);
        displayTicketDetails(ticket2);
        displayTicketDetails(ticket3);
    }

    public static void displayTicketDetails(Ticket ticket) {
        System.out.println("Start Point: " + ticket.getStartPoint());
        System.out.println("End Point: " + ticket.getEndPoint());

        if (ticket.validateTravelPoints()) {
            System.out.println("Ticket Amount: " + ticket.getTicketAmount());
        } else {
            System.out.println("Invalid travel points.");
        }

        System.out.println();
    }

}
