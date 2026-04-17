import java.util.*;
import java.util.stream.*;

// Reusing Bogie class from UC7
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class UC8_FilterBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Filtering System ===\n");

        // Step 1: Create list of bogies (same as UC7)
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 40));

        System.out.println("All Bogies:\n");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Step 2: Convert list to stream and apply filter
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)   // Condition
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):\n");
        for (Bogie b : filteredBogies) {
            b.display();
        }
    }
}