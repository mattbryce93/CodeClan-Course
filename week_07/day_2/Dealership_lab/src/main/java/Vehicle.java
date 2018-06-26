import java.util.ArrayList;

public abstract class Vehicle {
    private Engine engine;
    private ArrayList<Tyre> tyres;
    private double price;
    private String make;
    private String model;

    public Vehicle(Engine engine, ArrayList<Tyre> tyres, double price, String make, String model) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.make = make;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
