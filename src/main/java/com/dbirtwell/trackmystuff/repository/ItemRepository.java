package com.dbirtwell.trackmystuff.repository;

import org.springframework.data.repository.CrudRepository;

import com.dbirtwell.trackmystuff.model.Item;

public interface ItemRepository extends CrudRepository<Item,Integer> { 
    
}