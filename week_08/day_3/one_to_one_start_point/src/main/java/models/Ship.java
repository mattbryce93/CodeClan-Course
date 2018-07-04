package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ships")
public class Ship {

    private int id;
    private String name;
    private List<Pirate> crew;

    public Ship() {
    }

    public Ship(String name) {
        this.name = name;
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

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy="ship", fetch = FetchType.LAZY)
    public List<Pirate> getCrew() {
        return crew;
    }

    public void setCrew(List<Pirate> crew) {
        this.crew = crew;
    }
}