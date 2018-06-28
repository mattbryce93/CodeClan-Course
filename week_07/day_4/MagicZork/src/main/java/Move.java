public abstract class Move {

    private String name;
    private int attackValue;

    public Move(String name, int attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

}
