public class MP3 implements IConnect{

    public MP3() {
    }

    public String connect(Stereo stereo) {
        return "You've connected to a " + stereo.getMake() + " " + stereo.getModel();
    }
}
