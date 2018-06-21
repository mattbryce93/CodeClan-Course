public abstract class Employee {
    private String name;

    public abstract String work();

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
