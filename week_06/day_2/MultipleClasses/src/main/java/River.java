import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> fish;

    public River(){
        this.fish = new ArrayList<Salmon>();
    }

    public void addFish(Salmon salmon) {
        this.fish.add(salmon);
    }

    public int fishCount() {
        return this.fish.size();
    }


    public Salmon removeFish() {
        return this.fish.remove(0);
    }
}
