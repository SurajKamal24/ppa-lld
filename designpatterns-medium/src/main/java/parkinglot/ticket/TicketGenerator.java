package parkinglot.ticket;

import parkinglot.data.ParkingSpot;
import parkinglot.data.Ticket;
import parkinglot.data.Vehicle;

public class TicketGenerator {

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        String ticketNum = getUniqueTicketNum();
        // logic to check if isFree & then park & persist in DB
        return new Ticket(ticketNum, vehicle, parkingSpot);
    }

    private String getUniqueTicketNum() {
        return "";
    }
}
