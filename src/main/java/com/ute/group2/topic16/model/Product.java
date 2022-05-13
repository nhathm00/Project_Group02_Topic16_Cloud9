package com.ute.group2.topic16.model;

import com.ute.group2.topic16.controller.CartController;
import java.util.List;

public class Product {
    private String id;
    private String description;
    private String image_name;
    private String name;
    private double price;
    private double weight;
    private List<Category> category;
    
    public Product() {
    }
     public Product(Product product) {
        this.id = product.getId();
        this.description = product.getDescription();
        this.image_name = product.getImageName();
        this.name = product.getName();
        this.price = product.getPrice();
        this.weight = product.getWeight();
    }

    // Sử dụng trong JPA/Hibernate query
    public Product(String id, String name, double price, String description, String image_name,
    double weight) {
        this.id = id;
        this. description = description;
        this.name = name;
        this.price = price;
        this.image_name = image_name;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getImageName() {
        return image_name;
    }

    public void setImageName(String image_name) {
        this.image_name = image_name;
    }
     public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category= category;
    }

}
