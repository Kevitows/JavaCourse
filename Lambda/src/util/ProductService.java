package util;

import Entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public static Double sum(List<Product> products, Predicate<Product> predicate) {
        double sum = 0;
        for (Product p : products) {
            if (predicate.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }

}
