import java.util.*;

public class UC20_DefensiveSearch {

    public static void main(String[] args) {

        System.out.println("=== Train Search System ===\n");

        // Step 1: Bogie collection
        List<String> trainUnits = new ArrayList<>();

        // Uncomment to test valid case
        // trainUnits.add("BG101");
        // trainUnits.add("BG102");

        String searchKey = "BG101";

        try {
            // Step 2: Defensive check
            if (trainUnits.isEmpty()) {
                throw new IllegalStateException("Train has no bogies. Search not allowed.");
            }

            // Step 3: Search logic
            boolean found = false;

            for (String unit : trainUnits) {
                if (unit.equals(searchKey)) {
                    found = true;
                    break;
                }
            }

            // Step 4: Result
            if (found) {
                System.out.println("Bogie Found: " + searchKey);
            } else {
                System.out.println("Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            // Step 5: Graceful handling
            System.out.println("Error: " + e.getMessage());
        }

        // Step 6: Program continues
        System.out.println("\nProgram continues safely...");
    }
}