package device_management;

import behaviours.IInput;

public class Keyboard implements IInput {

    private String type;
    private int keyNumbers;

    public Keyboard(String type, int keyNumbers) {
        this.type = type;
        this.keyNumbers = keyNumbers;
    }

    public String clickKey(int keyNumber) {
        return "clicking: keyboard button " + keyNumber;
    }

    public String sendData(String data) {
        return "submitting: " + data;
    }
}
