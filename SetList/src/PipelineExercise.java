import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PipelineExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter full file path: ");
        String filePath = sc.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            while (line != null) {
                String[] line2 = line.split(",");
                products.add(new Product(line2[0], Double.parseDouble(line2[1])));
                line = reader.readLine();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Double averagePrice = products.stream().map(Product::getPrice).reduce(0.0, Double::sum) / products.size();
        System.out.printf("Average price: %.2f\n", averagePrice);

        Comparator<String> comparable = (x, y) -> x.compareToIgnoreCase(y);

        List<String> belowAverage = products.stream().
                filter(x -> x.getPrice() < averagePrice).
                map(Product::getName).
                sorted(comparable.reversed()).collect(Collectors.toList());

        for (String p : belowAverage) {
            System.out.println(p);
        }

    }

}
