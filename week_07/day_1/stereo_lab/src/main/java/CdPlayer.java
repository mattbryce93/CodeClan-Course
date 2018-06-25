public class CdPlayer extends Component{

    private int cdList;


    public CdPlayer(String make, String model, int cdList) {
        super(make, model);
        this.cdList = cdList;
    }

    public int getCdList() {
        return cdList;
    }

    public String play() {
        return "CD is playing!";
    }
}
