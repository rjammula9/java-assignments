package com.oop.simple.ticket;

public class Ticket {
    private int startPoint;
    private int endPoint;
    private int ticketAmount;
    public Ticket(){
        startPoint=2;
        endPoint=18;
        calculateTicketAmt();
    }

    public Ticket(int start, int end) {
        startPoint = start;
        endPoint = end;
        calculateTicketAmt();
    }



    public int getStartPoint() {
        return startPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }
    public boolean validateTravelPoints() {
        return endPoint > startPoint && endPoint > 0 && startPoint > 0;
    }
    public void calculateTicketAmt(){
        if(validateTravelPoints()){
            ticketAmount=(endPoint-startPoint)*20;
        }else{
            System.out.println("Invalid travel points");
        }
    }
}
