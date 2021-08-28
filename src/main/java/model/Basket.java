package model;

import java.util.List;

public class Basket {
    private int id;
    private String description;
    private int quantity;
    private int total;
    private List<Book> books;

    public Basket(Customer customer) {
    }

    public void addBooks(List<Book> books) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber() {
        return quantity;
    }

    public void setNumber(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
