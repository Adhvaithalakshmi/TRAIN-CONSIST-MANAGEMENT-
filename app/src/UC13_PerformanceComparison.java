import java.util.*;
import java.util.stream.*;

public class UC13_PerformanceComparison {

    // Simple class for testing
    static class TrainUnit {
        String name;
        int capacity;

        TrainUnit(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Performance Comparison: Loop vs Stream ===\n");

        // Step 1: Create test data (large dataset for meaningful timing)
        List<TrainUnit> list = new ArrayList<>();

        for (int i = 1; i <= 100000; i++) {
            list.add(new TrainUnit("Bogie" + i, i % 100));
        }

        // -------------------------------
        // Loop-Based Filtering
        // -------------------------------
        long startLoop = System.nanoTime();

        List<TrainUnit> loopResult = new ArrayList<>();
        for (TrainUnit t : list) {
            if (t.capacity > 50) {
                loopResult.add(t);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // Stream-Based Filtering
        // -------------------------------
        long startStream = System.nanoTime();

        List<TrainUnit> streamResult = list.stream()
                .filter(t -> t.capacity > 50)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // Results
        // -------------------------------
        System.out.println("Loop Filtering Time   : " + loopTime + " ns");
        System.out.println("Stream Filtering Time : " + streamTime + " ns");
    }
}