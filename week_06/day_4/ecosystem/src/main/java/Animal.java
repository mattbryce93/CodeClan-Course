public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String eat(){
        return this.name + " ate";
    }

    public String breathe(){
        return this.name + " took a breath";
    }

    public String getName() {
        return this.name;
    }
}
