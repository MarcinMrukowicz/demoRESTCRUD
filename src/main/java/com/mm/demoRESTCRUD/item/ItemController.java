package com.mm.demoRESTCRUD.item;

import com.mm.demoRESTCRUD.contractor.Contractor;
import com.mm.demoRESTCRUD.item.Item;
import com.mm.demoRESTCRUD.item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/item")
@CrossOrigin
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    private ArrayList<Item> getAllItems() {
        return (ArrayList<Item>) itemRepository.findAll();
    }

    @PostMapping
    private boolean addItem(@RequestBody Item item) {
        itemRepository.save(item);
        return true;
    }

    @DeleteMapping
    private Item deleteItem(@RequestBody Item item) {
        itemRepository.delete(item);
        return item;
    }

    @PutMapping
    private Item updateItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }
}
