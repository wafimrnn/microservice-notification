package com.pos.stock_management_service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTS")  // Ensure the table name is correct
public class Product {

    @Id
    private Long PROD_ID;  // Ensure the field name matches the column name

    private String prodName;
    private int quantityStock;
    private int restockLevel;

    // Getters and setters
    public Long getProdId() {
        return PROD_ID;
    }

    public void setProdId(Long prodId) {
        this.PROD_ID = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }

    public int getRestockLevel() {
        return restockLevel;
    }

    public void setRestockLevel(int restockLevel) {
        this.restockLevel = restockLevel;
    }
}
