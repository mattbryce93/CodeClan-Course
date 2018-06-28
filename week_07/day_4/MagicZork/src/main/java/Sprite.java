import java.util.ArrayList;

public abstract class Sprite {

    private String name;
    private int health;
    private int balance;
    private ArrayList<Move> moves;
    private Move currentMove;

    public Sprite(String name, int health, int balance, ArrayList<Move> moves) {
        this.name = name;
        this.health = health;
        this.balance = balance;
        this.moves = moves;
        this.currentMove = this.moves.get(0);
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getBalance() {
        return this.balance;
    }

    public ArrayList<Move> getMoves() {
        return this.moves;
    }

    public void addHealth(int value){
        this.health += value;
    }

    public void removeHealth(int value){
        this.health -= value;
    }

    public String checkHealth(){
        if(this.health <= 0){
            return this.name + " has died.";
        }
        return "this is fine";
    }

    public void changeBalance(int value){
        this.balance += value;
    }

    public int emptyBalance(){
        int amount = this.balance;
        this.balance = 0;
        return amount;
    }

    public Move getCurrentMove(){
        return this.currentMove;
    }

    public abstract void attack(Sprite sprite);
}
