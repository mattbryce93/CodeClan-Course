import java.util.ArrayList;

public class Car extends Vehicle implements IWheels {


    public Car(Engine engine, ArrayList<Tyre> tyres, double price, String make, String model) {
        super(engine, tyres, price, make, model);
    }

    public boolean canDrive() {
       if (getTyres().size() < 4){
        return false;
       }
       else {
           return true;
       }
    }
}
