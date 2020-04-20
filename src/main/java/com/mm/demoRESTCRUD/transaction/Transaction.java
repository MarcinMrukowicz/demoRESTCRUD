package com.mm.demoRESTCRUD.transaction;

import javax.persistence.*;

import com.mm.demoRESTCRUD.contractor.Contractor;
import com.mm.demoRESTCRUD.transactionItem.TransactionItem;

import java.util.List;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    long id;

    @ManyToOne
    @JoinColumn(name="contractor_id", nullable=false)
    Contractor contractor;

    @OneToMany
    @JoinColumn(name = "transaction_item_id")
    List<TransactionItem> transactionItems;

    public Transaction() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Contractor getConctractor() {
        return contractor;
    }

    public void setConctractor(Contractor conctractor) {
        this.contractor = conctractor;
    }

    public List<TransactionItem> getTransactionItems() {
        return transactionItems;
    }

    public void setTransactionItems(List<TransactionItem> transactionItems) {
        this.transactionItems = transactionItems;
    }
}
