public class RecordDeck extends Component {

    private int speeds;

    public RecordDeck(String make, String model, int speeds) {
        super(make, model);
        this.speeds = speeds;
    }

    public int getSpeeds() {
        return speeds;
    }

    public String play() {
        return "Record is playing!";
    }
}
