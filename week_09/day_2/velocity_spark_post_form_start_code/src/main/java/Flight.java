public class Flight {
    private String flightNumber;
    private String airline;
    private String departureAirport;
    private String arrivalAirport;
    private boolean seatsAvailable;

    public Flight(String flightNumber, String airline, String departureAirport, String arrivalAirport) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.seatsAvailable = true;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getAirline() {
        return this.airline;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return this.arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public boolean isSeatsAvailable() {
        return this.seatsAvailable;
    }

    public void setSeatsAvailable(boolean seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }
}
