package Applications;

import Entities.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class ProductLog {
    public static void main(String[] args) {

        Set<Log> logSet = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/tmp/log.csv"))) {
            String line = br.readLine();
            while(line != null) {
                String[] splitLine = line.split(" ");
                logSet.add(new Log(splitLine[0], Instant.parse(splitLine[1])));
                line = br.readLine();
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for(Log log : logSet) {
            System.out.println(log);
        }

        System.out.println("Total users: " + logSet.size());
    }
}
