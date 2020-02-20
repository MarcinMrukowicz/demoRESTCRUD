package com.mm.demoRESTCRUD.itemPrice;

import com.mm.demoRESTCRUD.contractor.Contractor;
import com.mm.demoRESTCRUD.item.Item;
import com.mm.demoRESTCRUD.item.ItemRepository;
import com.mm.demoRESTCRUD.transactionItem.TransactionItem;
import com.mm.demoRESTCRUD.transactionItem.TransactionItemRepository;
import com.mm.demoRESTCRUD.unit.Unit;
import com.mm.demoRESTCRUD.unit.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/api/itemPrice")
public class ItemPriceController {
    @Autowired
    private ItemPriceRepository itemPriceRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private UnitRepository unitRepository;
    @Autowired
    TransactionItemRepository transactionItemRepository;
    @PostConstruct
    private void setUp() {
        Unit u = new Unit();
        u.setName("kg");
        u = unitRepository.save(u);
        Item i = new Item();
        i.setName("jabłka");
        i.setUnit(u);
        i = itemRepository.save(i);
        ItemPrice itemPrice = new ItemPrice();

        //itemPrice.setId(10);
        itemPrice.setDate(new Date());
        itemPrice.setItem(i);
        itemPrice.setPrice(new BigDecimal("10.5"));
        itemPrice = itemPriceRepository.save(itemPrice);
        TransactionItem tri = new TransactionItem();

        tri.setNumberOfUnits(10);
        tri.setItemPrice(itemPrice);
        transactionItemRepository.save(tri);
    }

    @GetMapping(path = "/{id}")
    private ItemPrice getItemPriceById(@PathVariable(name="id") long id) {
        return itemPriceRepository.findOneById(id);
    }

    @GetMapping
    private ArrayList<ItemPrice> getAllPrices() {
        return (ArrayList<ItemPrice>) itemPriceRepository.findAll();
    }

    @PostMapping
    private ItemPrice addItemPrice(@RequestBody ItemPrice itemPrice) {
        return itemPriceRepository.save(itemPrice);
    }

    @PutMapping
    private ItemPrice updateItemPrice(@RequestBody ItemPrice itemPrice) {
        return itemPriceRepository.save(itemPrice);
    }

    @DeleteMapping
    private ItemPrice deleteItemPrice(@RequestBody ItemPrice itemPrice) {
        itemPriceRepository.delete(itemPrice);
        return itemPrice;
    }
}
