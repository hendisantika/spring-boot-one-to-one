package com.hendisantika.jpa.one2one.model;

import javax.persistence.*;

@Entity
@Table(name = "husband")
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(mappedBy = "husband")
    private Wife wife;

    public Husband() {
    }

    public Husband(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wife getWife() {
        return this.wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public String toString() {
        String info = String.format("Husband: name = %s has a wife with name = %s", this.name, this.wife.getName());
        return info;
    }
}
