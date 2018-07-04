package models;

import javax.persistence.*;

@Entity
@Table(name="pirates")
public class Pirate {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Weapon weapon;

    public Pirate() {
    }

    public Pirate(String firstName, String lastName, int age, Weapon weapon) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weapon = weapon;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Enumerated(value = EnumType.STRING)
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}