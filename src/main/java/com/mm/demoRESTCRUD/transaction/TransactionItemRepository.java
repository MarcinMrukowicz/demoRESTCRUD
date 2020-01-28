package com.mm.demoRESTCRUD.transaction;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TransactionItemRepository extends PagingAndSortingRepository<TransactionItem, Long> {
}
