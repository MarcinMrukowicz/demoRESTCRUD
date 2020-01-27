package com.mm.demoRESTCRUD.unit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Unit {
    @Id
    long id;

    String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
