package Applications;

import Entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeApp {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader("/tmp/in.txt"))) {
            String line = reader.readLine();
            while(line != null) {
                String[] emp = line.split(",");
                employees.add(new Employee(emp[0], Double.parseDouble(emp[2]), emp[1]));
                line = reader.readLine();
            }
            System.out.print("Show employee's emails whose salary is up to: ");
            double salary = sc.nextDouble();

            List<String> salaryEmployees = employees.stream()
                    .filter(x -> x.getSalary() > salary).
                    map(Employee::getEmail).
                    sorted().
                    collect(Collectors.toList());

            Double sum = employees.stream().
                    filter(x -> x.getName().charAt(0) == 'M').
                    map(Employee::getSalary).
                    reduce(0.0, Double::sum);


            salaryEmployees.forEach(System.out::println);
            System.out.printf("Sum of employees salaries that starts with 'M': $ %.2f", sum);
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
