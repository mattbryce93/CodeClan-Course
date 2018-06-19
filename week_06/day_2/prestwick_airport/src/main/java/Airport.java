import java.util.ArrayList;

public class Airport {

    private ArrayList<Person> departures;
    private String location;

    public Airport(String location) {
        this.location = location;
        this.departures = new ArrayList<Person>();
    }

    public int getDeparturesSize() {
        return this.departures.size();
    }

    public void addPerson(Person person) {
        this.departures.add(person);
    }

    public void removePerson(Person person) {
        this.departures.remove(person);
    }

    public void addDeparturestoAirplane(Airplane airplane) {
        for (int i = 0; i < getDeparturesSize(); i++){
            airplane.addPassenger(this.departures.get(i));
        }
        this.departures.clear();
    }


    public void addAirplanePassengerstoDepartures(Airplane airplane) {
        if (airplane.getDestination() == this.location) {
        ArrayList<Person> passengers = airplane.getPassengers();
        for (int i = 0; i < airplane.getPassengersSize(); i++){
            addPerson(passengers.get(i));
            airplane.removePassenger(passengers.get(i));
            }
        }
    }
}
