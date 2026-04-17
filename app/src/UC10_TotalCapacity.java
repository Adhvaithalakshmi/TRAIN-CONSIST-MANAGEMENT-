import java.util.*;

public class UC10_TotalCapacity {

    // Unique class name to avoid duplication issues
    static class TrainUnit {
        String name;
        int capacity;

        TrainUnit(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Capacity Aggregation System ===\n");

        // Step 1: Create list of train units (passenger bogies)
        List<TrainUnit> list = new ArrayList<>();

        list.add(new TrainUnit("Sleeper", 72));
        list.add(new TrainUnit("AC Chair", 60));
        list.add(new TrainUnit("First Class", 40));

        // Step 2: Stream → map → reduce
        int totalCapacity = list.stream()
                .map(t -> t.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);
    }
}