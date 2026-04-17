public class UC18_LinearSearch {

    public static void main(String[] args) {

        System.out.println("=== Train Unit Linear Search ===\n");

        // Step 1: Unsorted array of unit IDs
        String[] unitIDs = {"BG120", "BG101", "BG150", "BG110", "BG130"};

        // Step 2: Search key
        String searchKey = "BG110";

        boolean found = false;

        // Step 3: Linear Search (sequential traversal)
        for (String id : unitIDs) {
            if (id.equals(searchKey)) {
                found = true;
                break; // early termination
            }
        }

        // Step 4: Result display
        if (found) {
            System.out.println("Bogie ID Found: " + searchKey);
        } else {
            System.out.println("Bogie ID Not Found");
        }

        System.out.println("\nProgram continues...");
    }
}