package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gunners")
public class Gunner extends Pirate{

    private int ammo;

    public Gunner() {
    }

    public Gunner(String firstName, String lastName, int age, Weapon weapon, Ship ship, int ammo) {
        super(firstName, lastName, age, weapon, ship);
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public void fireCannon(){
        this.ammo = this.ammo -1;
    }
}
