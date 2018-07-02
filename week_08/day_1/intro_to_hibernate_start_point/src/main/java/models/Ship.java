package models;

import javax.persistence.*;

@Entity
@Table(name="ships")
public class Ship {

    private int id;
    private String name;
    private int length;
    private int mastHeight;
    private int draft;

    public Ship(String name, int length, int mastHeight, int draft) {
        this.name = name;
        this.length = length;
        this.mastHeight = mastHeight;
        this.draft = draft;
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

    @Column(name = "length")
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Column(name = "mastHeight")
    public int getMastHeight() {
        return mastHeight;
    }

    public void setMastHeight(int mastHeight) {
        this.mastHeight = mastHeight;
    }

    @Column(name = "draft")
    public int getDraft() {
        return draft;
    }

    public void setDraft(int draft) {
        this.draft = draft;
    }
}
