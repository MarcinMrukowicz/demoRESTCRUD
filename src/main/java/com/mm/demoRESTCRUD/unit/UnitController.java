package com.mm.demoRESTCRUD.unit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/unit")
public class UnitController {
    @Autowired
    private UnitRepository unitRepository;

    @GetMapping
    private ArrayList<Unit> getAllUnits() {
        return (ArrayList<Unit>) unitRepository.findAll();
    }

    @PostMapping
    private Unit addUnit(@RequestBody Unit unit) {
        return unitRepository.save(unit);
    }
}
