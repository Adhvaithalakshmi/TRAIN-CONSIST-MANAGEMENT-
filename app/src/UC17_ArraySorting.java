import java.util.Arrays;

public class UC17_ArraySorting {

    public static void main(String[] args) {

        System.out.println("=== Train Unit Sorting System ===\n");

        // Step 1: Array of train unit names
        String[] trainUnits = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        // Step 2: Before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(trainUnits));

        // Step 3: Sorting using built-in method
        Arrays.sort(trainUnits);

        // Step 4: After sorting
        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(trainUnits));

        System.out.println("\nProgram continues...");
    }
}