package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "captains")
public class Captain {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Weapon weapon;
    private int popularity;
    private Ship ship;
    private List<Raid> raids;

    public Captain() {
    }

    public Captain(String firstName, String lastName, int age, Weapon weapon, int popularity, Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weapon = weapon;
        this.popularity = popularity;
        this.ship = ship;
        this.raids = new ArrayList<Raid>();
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

    @Column(name = "popularity")
    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ship_id", nullable = false)
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
