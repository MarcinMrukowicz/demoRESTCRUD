package com.mm.demoRESTCRUD.contractor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/contractor")
public class ContractorController {

    @Autowired
    private ContractorRepository contractorRepository;

    @GetMapping
    private ArrayList<Contractor> getAllContractors() {
        return (ArrayList<Contractor>) contractorRepository.findAll();
    }

    @PostMapping
    private Contractor addContractor(@RequestBody Contractor contractor) {
        return contractorRepository.save(contractor);
    }
    @DeleteMapping
    private Contractor deleteContractor(@RequestBody Contractor contractor) {
        contractorRepository.delete(contractor);
        return contractor;
    }
    @PutMapping
    private Contractor updateContractor(@RequestBody Contractor contractor) {
        return contractorRepository.save(contractor);
    }
}
