package com.demo.items;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ItemsRepository extends JpaRepository<Item, Long> {

    @Query(value = "select i from Item i where i.s_id=?1 order by i.id")
    List<Item> findAllItemsForStudent(Long s_id);

}
