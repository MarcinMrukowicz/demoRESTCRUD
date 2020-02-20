package com.mm.demoRESTCRUD.unit;

import com.mm.demoRESTCRUD.item.Item;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UnitRepository extends PagingAndSortingRepository<Unit, Long> {
    Unit findOneById(long id);
}
