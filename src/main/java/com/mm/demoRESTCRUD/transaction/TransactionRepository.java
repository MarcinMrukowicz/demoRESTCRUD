package com.mm.demoRESTCRUD.transaction;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
    Transaction findOneById(long id);
}
