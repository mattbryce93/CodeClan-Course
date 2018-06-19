import java.util.ArrayList;

public class Airplane {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Airplane(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return destination;
    }

    public int getPassengersSize() {
        return passengers.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addPassenger(Person person) {
        if (capacity > getPassengersSize()){
            this.passengers.add(person);
        }
    }

    public ArrayList<Person> getPassengers() {
        return passengers;
    }

    public void removePassenger(Person person) {
        if (passengers.size() > 0) {
            this.passengers.remove(person);
        }
    }
}
