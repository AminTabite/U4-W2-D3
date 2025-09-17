package Entities;


import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Order {

    //attributi


    Long id;
    String status;
    LocalDate orderdate;
    LocalDate deliveryDate;
    List<Product> products;
    Costumer costumer;

    //costruttori


    Supplier<Long> RandomIdsup = () -> {
        Random rndm = new Random();
        return rndm.nextLong(1, 100000);

    };

    Order(LocalDate orderdate, LocalDate deliveryDate, List products, Costumer costumer) {

        this.id = RandomIdsup.get();
        this.orderdate = orderdate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.costumer = costumer;


    }

    //metodi


    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderdate() {
        return orderdate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }
}
