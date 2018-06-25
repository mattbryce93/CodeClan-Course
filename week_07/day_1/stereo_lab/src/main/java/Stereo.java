import java.util.ArrayList;
import java.util.BitSet;

public class Stereo {

    private String make;
    private String model;
    private ArrayList<Component> components;

    public Stereo(String make, String model) {
        this.make = make;
        this.model = model;
        this.components = new ArrayList<Component>();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public ArrayList<Component> getComponents() {
        return components;
    }

    public void addComponents(ArrayList<Component> components) {
        for (Component component : components) {
            this.components.add(component);
        }
    }

    public String tuneRadio(int frequency) {
        for (Component component : this.components) {
            if (component instanceof Radio) {
                return ((Radio) component).tune(frequency);
            }
        }
    return null;
    }

    public String playRecord() {
        for (Component component : this.components) {
    if (component instanceof RecordDeck) {
        return ((RecordDeck) component).play();
            }
        }
    return null;
    }

    public String playCD() {
        for (Component component : this.components) {
            if (component instanceof CdPlayer) {
                return ((CdPlayer) component).play();
            }
        }
        return null;
    }

}
