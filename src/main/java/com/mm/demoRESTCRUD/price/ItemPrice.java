package com.mm.demoRESTCRUD.price;

import com.mm.demoRESTCRUD.item.Item;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class ItemPrice {
    @Id
    long id;
    Date date;
    Item item;
    BigDecimal price;
}
