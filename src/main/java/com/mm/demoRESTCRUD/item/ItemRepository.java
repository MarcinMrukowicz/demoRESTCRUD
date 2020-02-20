package com.mm.demoRESTCRUD.item;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ItemRepository extends PagingAndSortingRepository<Item, Long> {
    Item findOneById(long id);
}
