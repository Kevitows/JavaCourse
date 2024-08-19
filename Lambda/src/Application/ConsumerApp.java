package Application;

import Entities.Product;
import util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApp {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.00));
        productList.add(new Product("HD Case", 80.90));

        /// interface method
        //productList.forEach(new ProductConsumer());

        /// declared lambda
        Consumer<Product> consumer = (p) -> p.setPrice(p.getPrice() * 1.1);

        productList.forEach(x -> x.setPrice(x.getPrice() * 1.1));

        /// static method
        //productList.forEach(Product::staticProductConsumer);

        /// non-static method
        //productList.forEach(Product::nonStaticProductConsumer);

        productList.forEach(System.out::println);

    }
}
