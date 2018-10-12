package lesson2;

import java.util.Date;

public class Order {
    private long id;
    private String productName;
    private int  price;
    private Date deateOrdered;
    private Date dateConfirmed;


    public Order(long id, String productName, int price, Date deateOrdered, Date dateConfirmed) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.deateOrdered = deateOrdered;
        this.dateConfirmed = dateConfirmed;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public Date getDeateOrdered() {
        return deateOrdered;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }
}
