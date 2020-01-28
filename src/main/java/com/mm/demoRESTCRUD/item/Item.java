package com.mm.demoRESTCRUD.item;

import com.mm.demoRESTCRUD.unit.Unit;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue
    long id;

    String name;

    @ManyToOne
    @JoinColumn(name="unit_id", nullable=false)
    Unit unit;

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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
