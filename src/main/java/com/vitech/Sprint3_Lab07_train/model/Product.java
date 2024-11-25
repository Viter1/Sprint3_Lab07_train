package com.vitech.Sprint3_Lab07_train.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Double price;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image; // Este campo almacenará la imagen en formato Base64

    public String getImage() {
        return image; // Devuelve la imagen en Base64
    }

    public void setImage(String image) {
        this.image = image; // Establece la imagen en formato Base64
    }

    // Constructor vacío
    public Product() {}

    public Product(Integer id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
