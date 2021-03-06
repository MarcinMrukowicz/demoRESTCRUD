package com.mm.demoRESTCRUD.transactionItem;

import com.mm.demoRESTCRUD.contractor.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/transactionItem")
@CrossOrigin
public class TransactionItemController {
    @Autowired
    TransactionItemRepository transactionItemRepository;
    @Autowired
    ContractorRepository contractorRepository;

    @GetMapping
    private ArrayList<TransactionItem> getAllTransactionItems() {
        return (ArrayList<TransactionItem>) transactionItemRepository.findAll();
    }

    @PostMapping
    private TransactionItem addTransactionItem(@RequestBody TransactionItem transactionItem) {
        return transactionItemRepository.save(transactionItem);
    }
    @DeleteMapping
    private TransactionItem deleteTransactionItem(@RequestBody TransactionItem transactionItem) {
        transactionItemRepository.delete(transactionItem);
        return transactionItem;
    }

    @PutMapping
    private TransactionItem updateTransactionItem(@RequestBody TransactionItem transactionItem) {
        return transactionItemRepository.save(transactionItem);
    }
}
