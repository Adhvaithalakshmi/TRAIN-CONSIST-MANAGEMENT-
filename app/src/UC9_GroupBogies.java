import java.util.*;
import java.util.stream.*;

public class UC9_GroupBogies {

    // Changed name to avoid duplication
    static class CoachDetails {
        String name;
        int capacity;
        String type;

        CoachDetails(String name, int capacity, String type) {
            this.name = name;
            this.capacity = capacity;
            this.type = type;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Grouping System ===\n");

        List<CoachDetails> list = new ArrayList<>();

        list.add(new CoachDetails("Sleeper", 72, "Passenger"));
        list.add(new CoachDetails("AC Chair", 60, "Passenger"));
        list.add(new CoachDetails("First Class", 40, "Passenger"));
        list.add(new CoachDetails("Cargo Rectangular", 100, "Goods"));
        list.add(new CoachDetails("Cargo Cylindrical", 120, "Goods"));

        Map<String, List<CoachDetails>> grouped = list.stream()
                .collect(Collectors.groupingBy(c -> c.type));

        for (Map.Entry<String, List<CoachDetails>> entry : grouped.entrySet()) {

            System.out.println("Category: " + entry.getKey());

            for (CoachDetails c : entry.getValue()) {
                System.out.println("Coach: " + c.name +
                        " | Capacity: " + c.capacity +
                        " | Type: " + c.type);
            }

            System.out.println();
        }
    }
}