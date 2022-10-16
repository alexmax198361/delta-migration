package com.disney.delta.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Usertype {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "type", nullable = true, length = 255)
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usertype usertype = (Usertype) o;
        return id == usertype.id && Objects.equals(type, usertype.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }
}
