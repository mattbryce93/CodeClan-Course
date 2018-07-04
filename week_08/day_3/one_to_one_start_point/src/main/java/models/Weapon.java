package models;

public enum Weapon {

    CUTLASS(20),
    PISTOL(30),
    CANNON(100),
    DAGGER(5);

    private int damageValue;

    Weapon(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
