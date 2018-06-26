import java.util.ArrayList;

public class Van extends Vehicle implements IWheels {

    public Van(Engine engine, ArrayList<Tyre> tyres, double price, String make, String model) {
        super(engine, tyres, price, make, model);
    }

    public boolean canDrive() {
        if (getTyres().size() < 5){
            return false;
        }
        else {
            return true;
        }
    }
}



