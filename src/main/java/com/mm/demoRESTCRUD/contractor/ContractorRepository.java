package com.mm.demoRESTCRUD.contractor;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContractorRepository extends PagingAndSortingRepository<Contractor, Long> {
    Contractor findOneById(long id);
}
