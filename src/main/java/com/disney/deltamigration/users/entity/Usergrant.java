package com.disney.delta.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Usergrant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usergrant usergrant = (Usergrant) o;
        return id == usergrant.id && Objects.equals(name, usergrant.name) && Objects.equals(description, usergrant.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }
}
