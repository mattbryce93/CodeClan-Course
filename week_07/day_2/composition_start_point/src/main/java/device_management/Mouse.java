package device_management;

import behaviours.IInput;

public class Mouse implements IInput {

    private String type;
    private int buttonNumber;

    public Mouse(String type, int buttonNumber) {
        this.type = type;
        this.buttonNumber = buttonNumber;
    }

    public String move(){
        return "moving: mouse";
    }

    public String clickButton(int button){
        return "clicking: mouse button " + button;
    }

    public String sendData(String data){
        return "sending: " + data;
    }
}
