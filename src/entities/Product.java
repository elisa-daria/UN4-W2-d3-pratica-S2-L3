package entities;

import java.util.Random;

public class Product {
    private long id;
    private String name;
    private String category;
    private double price;
    //constructor

    public Product(String name, String category, double price) {
        this.setId(id);
        this.setName(name);
        this.setCategory(category);
        this.setPrice(price);
    }

    //getters

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    //setters

    public void setId(long id) {
        Random rdm=new Random();
        this.id = rdm.nextInt(1,1001);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //methods
}
