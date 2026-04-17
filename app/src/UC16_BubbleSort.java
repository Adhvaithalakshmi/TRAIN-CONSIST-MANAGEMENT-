public class UC16_BubbleSort {

    public static void main(String[] args) {

        System.out.println("=== Passenger Capacity Sorting (Bubble Sort) ===\n");

        // Step 1: Create array of capacities
        int[] capacities = {72, 60, 40, 80, 55};

        System.out.println("Before Sorting:");
        printArray(capacities);

        // Step 2: Bubble Sort Logic
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Step 3: Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Step 4: Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 5: Display sorted result
        System.out.println("\nAfter Sorting (Ascending Order):");
        printArray(capacities);
    }

    // Helper method to print array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}