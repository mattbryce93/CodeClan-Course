import java.util.ArrayList;

public class Mage extends Sprite {

    private ArrayList<Spell> spells;

    public Mage(String name, int health, int balance, ArrayList<Move> moves) {
        super(name, health, balance, moves);
    }

    public void attack(Sprite sprite) {
        sprite.removeHealth(getCurrentMove().getAttackValue());
    }

}
