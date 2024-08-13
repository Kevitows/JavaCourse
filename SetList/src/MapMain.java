import java.util.Map;
import java.util.TreeMap;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "98765432");

        System.out.println("Contains 'phone' key? " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email address: " + cookies.get("emaill"));
        System.out.println("Sise: " + cookies.size());

        cookies.remove("email");

///     overwrites previous phone value
        cookies.put("phone", "845092");

        System.out.println("ALL COOKIES:");
        for(String key : cookies.keySet()) {
            System.out.println(key);
            System.out.println(cookies.get(key));
            System.out.println();
        }

    }
}
