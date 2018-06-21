public class Manager extends Employee {

    private int balance;

    public Manager(String name) {
        super(name);
        this.balance = 0;
    }

    public String work(){
        return "I'm in charge!";
    }

    public int getBalance() {
        return balance;
    }

    public void pay(int amount) {
        balance += amount;
    }
}
