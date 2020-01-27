package com.mm.demoRESTCRUD.item;

import com.mm.demoRESTCRUD.unit.Unit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item {
    @Id
    long id;
    String name;
    @OneToOne
    Unit unit;

}
