import java.util.HashMap;
import java.util.Map;

public class UC6_BogieCapacity {

    public static void main(String[] args) {

        // Step 1: Create HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        System.out.println("=== Train Consist Capacity Mapping System ===\n");

        // Step 2: Insert bogie-capacity pairs
        System.out.println("Adding bogie capacity details...\n");

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // Step 3: Display all bogie capacities using entrySet()
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        // Step 4: Demonstrate fast lookup
        System.out.println("\nChecking capacity for 'Sleeper' bogie...");
        int capacity = bogieCapacity.get("Sleeper");
        System.out.println("Sleeper Capacity: " + capacity);
    }
}