package com.mm.demoRESTCRUD.price;

import com.mm.demoRESTCRUD.contractor.Contractor;
import com.mm.demoRESTCRUD.contractor.ContractorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/itemPrice")
public class ItemPriceController {
    @Autowired
    private ItemPriceRepository itemPriceRepository;

    @GetMapping
    private ArrayList<ItemPrice> getAllItemPrices() {
        return (ArrayList<ItemPrice>) itemPriceRepository.findAll();
    }

    @PostMapping
    private ItemPrice addItemPrice(@RequestBody ItemPrice itemPrice) {
        return itemPriceRepository.save(itemPrice);
    }
}
