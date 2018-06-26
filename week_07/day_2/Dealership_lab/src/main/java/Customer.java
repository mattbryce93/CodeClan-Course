import java.util.ArrayList;

public class Customer extends Person {
    private double wallet;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, double wallet) {
        super(name);
        this.wallet = wallet;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public double getWallet() {
        return wallet;
    }

    public void buyVehicle(Vehicle vehicle){
        this.wallet -= vehicle.getPrice();
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public boolean canAfford(Vehicle vehicle){
        if (this.wallet >= vehicle.getPrice()){
            return true;
        } else {
            return false;
        }
    }
}
