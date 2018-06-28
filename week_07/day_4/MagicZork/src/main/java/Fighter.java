import java.util.ArrayList;

public class Fighter extends Sprite {

    private int armour;

    public Fighter(String name, int health, int balance, ArrayList<Move> weapons, int armour) {
        super(name, health, balance, weapons);
        this.armour = armour;
    }

    public void attack(Sprite sprite) {
        sprite.removeHealth(getCurrentMove().getAttackValue());
    }
}
