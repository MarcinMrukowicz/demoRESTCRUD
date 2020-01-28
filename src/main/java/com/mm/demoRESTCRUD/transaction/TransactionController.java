package com.mm.demoRESTCRUD.transaction;

import com.mm.demoRESTCRUD.contractor.Contractor;
import com.mm.demoRESTCRUD.contractor.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/transaction")
public class TransactionController {
    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    ContractorRepository contractorRepository;

    @GetMapping
    private ArrayList<Transaction> getAllTransactions() {
        return (ArrayList<Transaction>) transactionRepository.findAll();
    }

    @PostMapping
    private Transaction addTransaction(@RequestBody Transaction transaction) {
        //Optional<Contractor> c = contractorRepository.findById((long) 1);
        //transaction.setConctractor(c.get());
        //Transaction t = new Transaction();
        //t.setConctractor(new Contractor());
        //System.out.println(t.getConctractor());
        return transactionRepository.save(transaction);
    }
}
