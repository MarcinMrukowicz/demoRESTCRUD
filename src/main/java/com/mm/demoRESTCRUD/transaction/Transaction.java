package com.mm.demoRESTCRUD.transaction;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.mm.demoRESTCRUD.contractor.Contractor;
import com.mm.demoRESTCRUD.item.Item;

import java.util.List;

@Entity
public class Transaction {
    @Id
    long id;

    @OneToOne
    Contractor conctractor;

    @ManyToOne
    List<TransactionItem> transactionItems;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Contractor getConctractor() {
        return conctractor;
    }

    public void setConctractor(Contractor conctractor) {
        this.conctractor = conctractor;
    }

    public List<TransactionItem> getTransactionItems() {
        return transactionItems;
    }

    public void setTransactionItems(List<TransactionItem> transactionItems) {
        this.transactionItems = transactionItems;
    }
}
