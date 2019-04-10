package TripsPackage;

public class Trips {

    private final String INTERNAL_TRIP = "internal";
    private final String EXTERNAL_TRIP = "external";

    private final String NO_STOPS = "noStops";
    private final String ONE_STOP = "oneStop";
    private final String MANY_STOPS = "manyStops";

    public String getEXTERNAL_TRIP() {
        return EXTERNAL_TRIP;
    }

    public String getINTERNAL_TRIP() {
        return INTERNAL_TRIP;
    }

    public String getMANY_STOPS() {
        return MANY_STOPS;
    }

    public String getNO_STOPS() {
        return NO_STOPS;
    }

    public String getONE_STOP() {
        return ONE_STOP;
    }
}
