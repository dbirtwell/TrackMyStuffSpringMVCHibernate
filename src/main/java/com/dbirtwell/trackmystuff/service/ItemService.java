package com.dbirtwell.trackmystuff.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dbirtwell.trackmystuff.model.Item;
import com.dbirtwell.trackmystuff.repository.ItemRepository;

@Service("itemService")
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	@Transactional
	public List<Item> getAllItems() {
		List<Item> items=new ArrayList<Item>();
		Iterable<Item> itemsIterable=itemRepository.findAll();
		Iterator<Item> itemsIterator=itemsIterable.iterator();
		while(itemsIterator.hasNext())
		{
			items.add(itemsIterator.next());
		}
		return items;
	}

	@Transactional
	public Item getItem(int id) {
		return itemRepository.findOne(id);
	}

	@Transactional
	public void addItem(Item item) {
		itemRepository.save(item);
	}

	@Transactional
	public void updateItem(Item item) {
		itemRepository.save(item);

	}

	@Transactional
	public void deleteItem(int id) {
		itemRepository.delete(id);
	}
}
