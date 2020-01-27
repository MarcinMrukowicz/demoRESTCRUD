package com.mm.demoRESTCRUD.contractor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contractor {
    @Id
    long id;

    String name;
    String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
