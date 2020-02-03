package com.mm.demoRESTCRUD.transactionItem;

import com.mm.demoRESTCRUD.itemPrice.ItemPrice;

import javax.persistence.*;
import java.util.List;

@Entity
public class TransactionItem {
    @Id
    long id;
    double numberOfUnits;
    @OneToOne
    @JoinColumn(name="itemprice_id")
    ItemPrice itemPrice;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public ItemPrice getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(ItemPrice itemPrice) {
        this.itemPrice = itemPrice;
    }
}
