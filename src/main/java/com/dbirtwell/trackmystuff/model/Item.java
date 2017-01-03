package com.dbirtwell.trackmystuff.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Item table in database
 */
@Entity
@Table(name="ITEM")
public class Item{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="itemName")
	String itemName;
	
	@Column(name="itemDescription")
	String itemDescription;	

	@Column(name="itemLocation")
	String itemLocation;	
	
	@Column(name="itemType")
	String itemType;	
	
	public Item() {
		super();
	}
	public Item(int i, String itemName, String itemType, String itemLocation, String itemDescription) {
		super();
		this.id = i;
		this.itemName = itemName;
		this.itemType=itemType;
		this.itemLocation=itemLocation;		
		this.itemDescription=itemDescription;		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}	
	public String getItemLocation() {
		return itemLocation;
	}
	public void setItemLocation(String itemLocation) {
		this.itemLocation = itemLocation;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}	
}