package Application;

import Entities.Product;
import util.ProductFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionApp {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.50));
        productList.add(new Product("HD Case", 80.90));

        /// interface method
        List<String> names = productList.stream().map(new ProductFunction()).collect(Collectors.toList());

        /// static method
        List<String> names1 = productList.stream().map(Product::staticFunctionMethod).collect(Collectors.toList());

        /// non-static method
        List<String> names2 = productList.stream().map(Product::nonStaticFunctionMethod).collect(Collectors.toList());


        Function<Product, String> function = (p) -> p.getName().toUpperCase();
        List<String> names3 = productList.stream().map(function).collect(Collectors.toList());

        /// lambda
        List<String> names4 = productList.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        //productList.forEach(p -> p.setName(names.get(productList.indexOf(p))));

        names3.forEach(System.out::println);

    }
}
