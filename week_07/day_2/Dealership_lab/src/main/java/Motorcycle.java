import java.util.ArrayList;

public class Motorcycle extends Vehicle implements IWheels {

    public Motorcycle(Engine engine, ArrayList<Tyre> tyres, double price, String make, String model) {
        super(engine, tyres, price, make, model);
    }

    public boolean canDrive() {
        if (getTyres().size() < 2){
            return false;
        }
        else {
            return true;
        }
    }
}

