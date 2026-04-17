import java.util.*;

// Step 1: Create Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

public class UC7_SortBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Sorting System ===\n");

        // Step 2: Create List to store Bogie objects
        List<Bogie> bogieList = new ArrayList<>();

        // Step 3: Add passenger bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 40));

        System.out.println("Before Sorting:\n");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Step 4: Sort using Comparator (Lambda Expression)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (Ascending by Capacity):\n");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}