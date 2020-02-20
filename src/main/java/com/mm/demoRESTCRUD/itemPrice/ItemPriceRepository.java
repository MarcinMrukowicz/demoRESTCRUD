package com.mm.demoRESTCRUD.itemPrice;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ItemPriceRepository extends PagingAndSortingRepository<ItemPrice, Long> {
    ItemPrice findOneById(long id);
}
