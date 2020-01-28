package com.mm.demoRESTCRUD.price;

import com.mm.demoRESTCRUD.item.Item;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ItemPriceRepository extends PagingAndSortingRepository<ItemPrice, Long> {
}
