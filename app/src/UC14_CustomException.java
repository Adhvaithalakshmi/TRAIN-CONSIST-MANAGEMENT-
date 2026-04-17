import java.util.*;

public class UC14_CustomException {

    // Step 1: Custom Exception Class
    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String message) {
            super(message);
        }
    }

    // Step 2: Passenger Bogie Class
    static class PassengerUnit {
        String name;
        int capacity;

        // Constructor with validation
        PassengerUnit(String name, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException(
                        "Invalid capacity for " + name + " (must be > 0)");
            }

            this.name = name;
            this.capacity = capacity;
        }

        void display() {
            System.out.println("Bogie: " + name + " | Capacity: " + capacity);
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Bogie Creation with Validation ===\n");

        List<PassengerUnit> train = new ArrayList<>();

        try {
            // Valid bogies
            train.add(new PassengerUnit("Sleeper", 72));
            train.add(new PassengerUnit("AC Chair", 60));

            // Invalid bogie (will throw exception)
            train.add(new PassengerUnit("First Class", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies only
        System.out.println("\nFinal Train Formation:\n");
        for (PassengerUnit p : train) {
            p.display();
        }
    }
}