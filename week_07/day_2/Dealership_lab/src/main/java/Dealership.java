import java.util.ArrayList;

public class Dealership {
    private String name;
    private Till till;
    private Dealer dealer;
    private Customer customer;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, Till till, Dealer dealer, Customer customer, ArrayList<Vehicle> vehicles) {
        this.name = name;
        this.till = till;
        this.dealer = dealer;
        this.customer = customer;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public Till getTill() {
        return till;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void sellVehicle(Customer customer, Vehicle vehicle){
        if (((IWheels) vehicle).canDrive()) {
            if (customer.canAfford(vehicle)) {
                customer.buyVehicle(vehicle);
                till.setBalance(till.getBalance() + vehicle.getPrice());
                vehicles.remove(vehicle);
                }
        }
    }

    public ArrayList<IWheels> availableVehicles(){
        ArrayList<IWheels> available = new ArrayList<IWheels>();
        for (Vehicle vehicle : vehicles){
            if (((IWheels) vehicle).canDrive()){
                available.add((IWheels) vehicle);
            }
        }
        return available;
    }
}
