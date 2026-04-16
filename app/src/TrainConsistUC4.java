import java.util.LinkedList;

public class TrainConsistUC4 {

    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train);

        // Insert Pantry Car at position 2 (index 1)
        train.add(1, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car at Position 2:");
        System.out.println(train);

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Display final train consist
        System.out.println("\nFinal Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}