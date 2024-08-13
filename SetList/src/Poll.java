import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Poll {
    public static void main(String[] args) {

        Map<String, Integer> votes = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/tmp/in.txt"))) {
            String line = br.readLine();
            while(line != null) {
                String[] fields = line.split(",");
                if (votes.containsKey(fields[0])) {
                    votes.put(fields[0], votes.get(fields[0]) + Integer.parseInt(fields[1]));
                }
                else {
                    votes.put(fields[0], Integer.valueOf(fields[1]));
                }
                line = br.readLine();
            }

        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String x : votes.keySet()) {
            System.out.println(x + ": " + votes.get(x));
        }

    }
}
