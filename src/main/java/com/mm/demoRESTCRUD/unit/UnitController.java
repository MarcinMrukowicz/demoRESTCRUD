package com.mm.demoRESTCRUD.unit;

import com.mm.demoRESTCRUD.contractor.Contractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/unit")
public class UnitController {
    @Autowired
    private UnitRepository unitRepository;

    @GetMapping
    private ArrayList<Unit> getAllUnits() {
        return (ArrayList<Unit>) unitRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    private Unit getUnitById(@PathVariable(name="id") long id) {
        return unitRepository.findOneById(id);
    }

    @PostMapping
    private Unit addUnit(@RequestBody Unit unit) {
        return unitRepository.save(unit);
    }
    @DeleteMapping
    private Unit deleteUnit(@RequestBody Unit unit) {
        unitRepository.delete(unit);
        return unit;
    }
    @PutMapping
    private Unit updateUnit(@RequestBody Unit unit) {
        return unitRepository.save(unit);
    }
}
