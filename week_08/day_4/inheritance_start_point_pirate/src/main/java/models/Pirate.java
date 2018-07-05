package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pirates")
public class Pirate {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Weapon weapon;
    private Ship ship;
    private List<Raid> raids;

    public Pirate() {
    }

    public Pirate(String firstName, String lastName, int age, Weapon weapon, Ship ship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weapon = weapon;
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

    @ManyToOne
    @JoinColumn(name="ship_id", nullable=false)
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "pirate_raid",
            joinColumns = {@JoinColumn(name = "pirate_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "raid_id", nullable = false, updatable = false)})
    public List<Raid> getRaids() {
        return raids;
    }

    public void setRaids(List<Raid> raids) {
        this.raids = raids;
    }

    public void addRaid(Raid raid){
        this.raids.add(raid);
    }
}