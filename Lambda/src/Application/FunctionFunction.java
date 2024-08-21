package Application;

import Entities.Product;
import util.ProductService;

import java.util.ArrayList;
import java.util.List;

public class FunctionFunction {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        double sum = ProductService.sum(products, x -> x.getName().charAt(0) == 'T');
        System.out.println(sum);
        
        ///Function<Product, Double> function = Product::getPrice;
        ///Double sum = products.stream().filter(x -> x.getName().charAt(0) == 'T').map(function).reduce(0.0, Double::sum);
    }

}
