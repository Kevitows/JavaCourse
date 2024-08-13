package Entities;

import java.util.Objects;

public class Product2 {
    private String name;
    private Double price;

    public Product2(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return getName() + " - " + getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product2 product2 = (Product2) o;
        return Objects.equals(name, product2.name) && Objects.equals(price, product2.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
