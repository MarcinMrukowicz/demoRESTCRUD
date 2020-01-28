package com.mm.demoRESTCRUD.transaction;

import com.mm.demoRESTCRUD.item.Item;
import com.mm.demoRESTCRUD.price.ItemPrice;

import javax.persistence.*;
import java.util.List;

@Entity
public class TransactionItem {
    @Id
    long id;
    double numberOfUnits;
    //@OneToMany(mappedBy = "transactionItem")
    //List<ItemPrice> itemPrices;

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

    /*public List<ItemPrice> getItemPrices() {
        return itemPrices;
    }

    public void setItemPrices(List<ItemPrice> itemPrices) {
        this.itemPrices = itemPrices;
    }*/
}
