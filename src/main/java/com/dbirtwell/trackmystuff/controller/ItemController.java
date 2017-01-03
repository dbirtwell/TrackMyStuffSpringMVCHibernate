package com.dbirtwell.trackmystuff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dbirtwell.trackmystuff.model.Item;
import com.dbirtwell.trackmystuff.service.ItemService;


@Controller
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value = "/getAllItems", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getCountries(Model model) {
		
		List<Item> listOfItems = itemService.getAllItems();
		model.addAttribute("item", new Item());
		model.addAttribute("listOfItems", listOfItems);
		return "itemDetails";
	}

	@RequestMapping(value = "/getItem/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Item getItemById(@PathVariable int id) {
		return itemService.getItem(id);
	}

	@RequestMapping(value = "/addItem", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addItem(@ModelAttribute("item") Item item) {	
		if(item.getId()==0)
		{
			itemService.addItem(item);
		}
		else
		{	
			itemService.updateItem(item);
		}
		
		return "redirect:/getAllItems";
	}

	@RequestMapping(value = "/updateItem/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateItem(@PathVariable("id") int id,Model model) {
		 model.addAttribute("item", this.itemService.getItem(id));
	        model.addAttribute("listOfItems", this.itemService.getAllItems());
	        return "itemDetails";
	}

	@RequestMapping(value = "/deleteItem/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteItem(@PathVariable("id") int id) {
		itemService.deleteItem(id);
		 return "redirect:/getAllItems";

	}	
}
