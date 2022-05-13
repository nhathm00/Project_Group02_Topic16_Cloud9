package com.ute.group2.topic16.controller;

import java.io.Serializable;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;*/


public class CartController implements Serializable {
    private static final long serialVersionUID = -1000119078147252957L;

    //Id
    //Column(name = "Code", length = 20, nullable = false)
    private String id;

    //Column(name = "Name", length = 255, nullable = false)
    private String name;

    //Column(name = "Price", nullable = false)
    private double price;

    //image
    //Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
    private byte[] image;
    
    private String image_name;
    
    private String description;
    
    private double weight;
    
    public CartController() {
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

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
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
}
