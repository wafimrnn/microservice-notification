package com.pos.stock_management_service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Product {
    @Id
    @Column(name = "PROD_ID") // Maps to the "PROD_ID" column in the database
    private int id;

    @Column(name = "PROD_NAME") // Maps to the "PROD_NAME" column in the database
    private String name;

    @Column(name = "RESTOCK_LEVEL") // Maps to the "RESTOCK_LEVEL" column
    private int restockLevel;

    @Column(name = "QUANTITY_STOCK") // Maps to the "QUANTITY_STOCK" column
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
