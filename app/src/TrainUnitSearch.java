public class TrainUnitSearch {

    public static void main(String[] args) {

        System.out.println("=== Train Unit Binary Search System ===\n");

        // Step 1: Sorted array of unit IDs (IMPORTANT: must be sorted)
        String[] unitIDs = {"BG101", "BG105", "BG110", "BG120", "BG130"};

        // Step 2: Search key
        String key = "BG110";

        // Step 3: Initialize low and high
        int low = 0;
        int high = unitIDs.length - 1;

        boolean found = false;

        // Step 4: Binary Search Logic
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(unitIDs[mid]);

            if (result == 0) {
                System.out.println("Unit ID Found at index: " + mid);
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;   // Search right half
            } else {
                high = mid - 1;  // Search left half
            }
        }

        // Step 5: If not found
        if (!found) {
            System.out.println("Unit ID not found in the train.");
        }
    }
}