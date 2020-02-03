package com.mm.demoRESTCRUD.transactionItem;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransactionItemRepository extends PagingAndSortingRepository<TransactionItem, Long> {
}
