package com.mm.demoRESTCRUD.price;

import com.mm.demoRESTCRUD.item.Item;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class ItemPrice {
    @Id
    @GeneratedValue
    long id;
    Date date;
    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    Item item;
    BigDecimal price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
