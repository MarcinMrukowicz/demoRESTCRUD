package com.mm.demoRESTCRUD.unit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/unit")
@CrossOrigin
public class UnitController {
    @Autowired
    private UnitRepository unitRepository;

    @GetMapping
    private ArrayList<Unit> getAllUnits() {
        return (ArrayList<Unit>) unitRepository.findAll();
    }
    
    @GetMapping("/{id}")
    private Unit getOneById(@PathVariable long id) {
        System.out.println(id);
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
