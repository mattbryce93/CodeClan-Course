public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }


    public String talk() {
        return "Hello I am " + getName();
    }
}
