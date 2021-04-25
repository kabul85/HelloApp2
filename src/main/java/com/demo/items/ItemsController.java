package com.demo.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemsController {

    @Autowired
    private final ItemsRepository itemsRepository;

    public ItemsController(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemsRepository.findAll();
    }

    @GetMapping("/items/{id}")
    public Item getItemById(@PathVariable Long id) {
        return itemsRepository.findById(id).orElseThrow();
    }

    @GetMapping("/itemsbystudent/{s_id}")
    public List<Item> getItemsByStudentId(@PathVariable Long s_id) {
        return itemsRepository.findAllItemsForStudent(s_id);
    }
}
