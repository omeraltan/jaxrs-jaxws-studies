package com.rest.beenparam;

import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

public class Product {

    @QueryParam("productId")
    private int id;

    @MatrixParam("brand")
    private String brand;

    @MatrixParam("price")
    private double price;

    @PathParam("category")
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", brand='" + brand + '\'' +
            ", price=" + price +
            ", category='" + category + '\'' +
            '}';
    }
}
