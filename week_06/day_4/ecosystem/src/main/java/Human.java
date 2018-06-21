public class Human extends Mammal {

    public Human(String name){
        super(name);
    }

    public String walk() {
        return getName() + " that's one small step";
    }

}
