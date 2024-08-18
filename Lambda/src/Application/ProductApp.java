package Application;

import Entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductApp {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Notebook", 1200.00));
        productList.add(new Product("Tablet", 450.00));

        Comparator<Product> productComparator = new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return p1.getPrice().compareTo(p2.getPrice());
            }
        };

        Comparator<Product> productComparator2 = (p1, p2) -> {
            return -p1.getPrice().compareTo(p2.getPrice());
        };

        productList.sort(ProductApp::compareMethod);
        productList.sort(productComparator);
        productList.sort(productComparator2);
        productList.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        for (Product p : productList) {
            System.out.println(p);
        }
    }

    public static int compareMethod(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

}
 