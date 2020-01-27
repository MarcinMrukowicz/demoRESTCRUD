package com.mm.demoRESTCRUD.contractor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contractor")
public class ContractorController {

    @Autowired
    private ContractorRepository contractorRepository;

    @PostMapping
    private Contractor addContractor(@RequestBody Contractor contractor) {
        return contractorRepository.save(contractor);
    }

}
