package com.mm.demoRESTCRUD.item;

import com.mm.demoRESTCRUD.contractor.Contractor;
import com.mm.demoRESTCRUD.item.Item;
import com.mm.demoRESTCRUD.item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/item")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    private ArrayList<Item> getAllItems() {
        return (ArrayList<Item>) itemRepository.findAll();
    }

    @PostMapping
    private Item addItem(@RequestBody Item item) {
        return itemRepository.save(item);
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
