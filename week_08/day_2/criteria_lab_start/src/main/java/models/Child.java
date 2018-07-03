package models;

import javax.persistence.*;

@Entity
@Table(name = "children")
public class Child {

    private int id;
    private String name;
    private int age;
    private String range;

    public Child() {
    }

    public Child(String name, int age, String range) {
        this.name = name;
        this.age = age;
        this.range = range;
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

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "range")
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
