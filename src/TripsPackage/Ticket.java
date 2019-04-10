package TripsPackage;

public class Ticket {
    public enum Type {
        ONE_WAY, TWO_WAYS
    }

    public Trip trip;
    public Ticket.Type ticketType;

    public Ticket(Trip trip, Ticket.Type ticketType) {
        this.trip = trip;
        this.ticketType = ticketType;
    }
}

