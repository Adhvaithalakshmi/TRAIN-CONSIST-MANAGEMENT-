import java.util.*;
import java.util.stream.*;

public class UC9_GroupBogies {

    // Unique class name (no conflict anywhere)
    static class TrainUnit {
        String name;
        int capacity;
        String type;

        TrainUnit(String name, int capacity, String type) {
            this.name = name;
            this.capacity = capacity;
            this.type = type;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Grouping System ===\n");

        List<TrainUnit> list = new ArrayList<>();

        list.add(new TrainUnit("Sleeper", 72, "Passenger"));
        list.add(new TrainUnit("AC Chair", 60, "Passenger"));
        list.add(new TrainUnit("First Class", 40, "Passenger"));
        list.add(new TrainUnit("Cargo Rectangular", 100, "Goods"));
        list.add(new TrainUnit("Cargo Cylindrical", 120, "Goods"));

        Map<String, List<TrainUnit>> grouped = list.stream()
                .collect(Collectors.groupingBy(t -> t.type));

        for (Map.Entry<String, List<TrainUnit>> entry : grouped.entrySet()) {

            System.out.println("Category: " + entry.getKey());

            for (TrainUnit t : entry.getValue()) {
                System.out.println("Unit: " + t.name +
                        " | Capacity: " + t.capacity +
                        " | Type: " + t.type);
            }

            System.out.println();
        }
    }
}