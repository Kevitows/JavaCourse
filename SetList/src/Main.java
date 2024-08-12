import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] strings = {"IPhone", "PS5", "Motherboard", "Mouse"};

        Set<String> hashSet = new HashSet<>(Arrays.asList(strings));

        hashSet.add("TV");
        hashSet.add("Tablet");
        hashSet.add("Notebook");

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("TV");
        treeSet.add("Notebook");
        treeSet.add("Tablet");

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("TV");
        linkedHashSet.add("Notebook");
        linkedHashSet.add("Tablet");

        hashSet.remove("TV");
        treeSet.removeIf(x -> x.length() > 3);
        linkedHashSet.removeIf(x -> x.charAt(0) == 'T');

        for (String s : hashSet) {
            System.out.println(s);
        }
        System.out.println("===============");
        for (String s : treeSet) {
            System.out.println(s);
        }
        System.out.println("===============");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}