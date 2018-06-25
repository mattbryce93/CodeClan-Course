public class Radio extends Component{

    public Radio(String make, String model) {
        super(make, model);
    }

    public String tune(int frequency){
        if (frequency > 97 && frequency < 99) {
            return "Radio 1";
        } else {
            return "No Station Here";
        }
    }
}
