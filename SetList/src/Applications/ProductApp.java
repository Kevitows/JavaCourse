package Applications;

import Entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class ProductApp {
    public static void main(String[] args) {

        Set<Product> products = new TreeSet<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Notebook", 1200.00));
        products.add(new Product("Tablet", 400.00));

        for(Product p : products) {
            System.out.println(p);
        }
    }
}
