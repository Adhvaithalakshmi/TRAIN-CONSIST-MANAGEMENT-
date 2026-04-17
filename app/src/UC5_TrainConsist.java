import java.util.LinkedHashSet;

public class UC5_TrainConsist {

    public static void main(String[] args) {

        // Step 1: Create LinkedHashSet to store train bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        System.out.println("=== Train Consist Management System ===\n");

        // Step 2: Add bogies to the train
        System.out.println("Adding bogies to the train...\n");

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt to add duplicate bogie
        System.out.println("Attempting to add duplicate bogie: Sleeper\n");

        boolean added = trainFormation.add("Sleeper");

        if (!added) {
            System.out.println("Duplicate bogie 'Sleeper' detected!");
            System.out.println("LinkedHashSet ignored the duplicate automatically.\n");
        }

        // Step 4: Display final train formation
        System.out.println("Final Train Formation (Insertion Order Preserved):\n");

        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        // Step 5: Summary
        System.out.println("\nTotal Bogies in Train: " + trainFormation.size());
    }
}