package Application;

import Entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApp {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.50));
        productList.add(new Product("HD Case", 80.90));

        /// static method reference
        ///productList.removeIf(Product::staticProductPredicate);

        /// non-static method reference
        ///productList.removeIf(Product::nonStaticProductPredicate);

        /// lambda expression
        Predicate<Product> productPredicate = new ProductPredicate() {
            public boolean predicate(Product p) {
                return p.getPrice() > 100;
            }
        };
       ///productList.removeIf(productPredicate);

        ///one line lambda expression
        productList.removeIf(p -> p.getPrice() < 100);

        for(Product p : productList) {
            System.out.println(p);
        }
    }
}
