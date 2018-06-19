import java.util.ArrayList;

public class Bear {
    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String name){
        this.name = name;
        this.belly = new ArrayList<Salmon>();
    }

    public int foodCount() {
        return this.belly.size();
    }

    public void sleep() {
        this.belly.clear();
    }

    public void eatFishFromRiver(River river) {
        this.belly.add(river.removeFish());
    }
}