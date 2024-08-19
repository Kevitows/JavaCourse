package Entities;

import java.util.function.Function;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
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
        return getName() + " - " + String.format("%.2f", getPrice());
    }

    public static boolean staticProductPredicate(Product p) {
        return p.getPrice() < 100;
    }

    public boolean nonStaticProductPredicate() {
        return getPrice() < 100;
    }

    public static void staticProductConsumer(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticProductConsumer() {
        setPrice(getPrice() * 1.1);
    }

    public static String staticFunctionMethod(Product p) {
        return p.getName().toUpperCase();
    }
    public String nonStaticFunctionMethod() {
        return getName().toUpperCase();
    }

}
