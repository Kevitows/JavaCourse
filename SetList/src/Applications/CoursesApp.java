package Applications;

import Entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CoursesApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Student> courseA = new HashSet<>();
        Set<Student> courseB = new HashSet<>();
        Set<Student> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            courseA.add(new Student(sc.nextInt()));
        }
        System.out.print("How many students for course B? ");
        int j = sc.nextInt();
        for(int k = 0; k < j; k++) {
            courseB.add(new Student(sc.nextInt()));
        }

        System.out.print("How many students for course C? ");
        int l = sc.nextInt();
        for(int m = 0; m < l; m++) {
            courseC.add(new Student(sc.nextInt()));
        }

        Set<Student> students = new HashSet<>(courseA);
        students.addAll(courseB); students.addAll(courseC);

        System.out.println("Total students: " + students.size());

        sc.close();
    }
}