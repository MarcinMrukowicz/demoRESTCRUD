package com.mm.demoRESTCRUD.transaction;

import javax.persistence.*;

import com.mm.demoRESTCRUD.contractor.Contractor;
import com.mm.demoRESTCRUD.item.Item;

import java.util.List;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    long id;

    @ManyToOne
    @JoinColumn(name="conctractor_id", nullable=false)
    Contractor conctractor;

    @OneToMany
    @JoinColumn(name = "transaction_item_id", nullable = false)
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
