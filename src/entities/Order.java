package entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    //attributes
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;

    Customer customer;
    List<Product> products;

    //constructor

    public Order(String status, LocalDate orderDate, LocalDate deliveryDate, Customer customer, List<Product> products) {
        this.setId(id);
        this.setStatus(status);
        this.setOrderDate(orderDate);
        this.setDeliveryDate(deliveryDate);
        this.setCustomer(customer);
        this.setProducts(products);
    }

    //getters

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    //setters

    public void setId(long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    //methods

}
