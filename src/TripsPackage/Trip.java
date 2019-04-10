package TripsPackage;

public class Trip {
    public enum Type {
        INTERNAL_TRIP,
        EXTERNAL_TRIP,
        NO_STOPS,
        ONE_STOP,
        MANY_STOPS
    }


    public Trip.Type tripType;
    public String source;
    public String destination;
    public int seatsCount;
    public Date date;

    public Trip(String souce, String destination, Trip.Type tripType, int seatsCount, Date date) {
        this.tripType = tripType;
        this.source = source;
        this.destination = destination;
        this.seatsCount = seatsCount;
        this.date = date;
    }
}