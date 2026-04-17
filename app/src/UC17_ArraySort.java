import java.util.*;
public class UC17_ArraySort{
    public static void main(String[] args) {

        System.out.println("=== Train Unit Sorting (Arrays.sort) ===\n");

        // Step 1: Create array with different variable name
        String[] coachTypes = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        // Step 2: Before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(coachTypes));

        // Step 3: Sorting
        Arrays.sort(coachTypes);

        // Step 4: After sorting
        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(coachTypes));
    }
}