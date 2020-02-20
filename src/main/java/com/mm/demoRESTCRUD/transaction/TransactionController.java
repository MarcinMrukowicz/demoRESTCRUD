package com.mm.demoRESTCRUD.transaction;

import com.mm.demoRESTCRUD.contractor.Contractor;
import com.mm.demoRESTCRUD.contractor.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
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

    @GetMapping(path = "/{id}")
    private Transaction getTransactionById(@PathVariable(name="id") long id) {
        return transactionRepository.findOneById(id);
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
    @DeleteMapping
    private Transaction deleteTransaction(@RequestBody Transaction transaction) {
        transactionRepository.delete(transaction);
        return transaction;
    }

    @PutMapping
    private Transaction updateTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
