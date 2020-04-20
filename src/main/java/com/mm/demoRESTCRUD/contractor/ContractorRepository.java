package com.mm.demoRESTCRUD.contractor;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContractorRepository extends PagingAndSortingRepository<Contractor, Long> {
    Contractor findOneByAddress(String address);
    List<Contractor> findAllByAddress(String address);
}
