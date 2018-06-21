public class Chimpanzee extends Mammal{

    public Chimpanzee(String name){
        super(name);
    }

    public String walk() {
        return getName() + " crawled with his fists";
    }
}
