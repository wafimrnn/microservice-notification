package com.pos.stock_management_service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int id;
	private String name;
    private int restockLevel;
    private int quantityStock;
    
    // Getters and setters
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRestockLevel() {
		return restockLevel;
	}
	public void setRestockLevel(int restockLevel) {
		this.restockLevel = restockLevel;
	}
	public int getQuantityStock() {
		return quantityStock;
	}
	public void setQuantityStock(int quantityStock) {
		this.quantityStock = quantityStock;
	}
}
