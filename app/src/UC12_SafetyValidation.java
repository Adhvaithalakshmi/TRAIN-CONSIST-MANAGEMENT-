import java.util.*;
import java.util.function.Predicate;

public class UC12_SafetyValidation {

    // Goods bogie class
    static class GoodsUnit {
        String type;   // Rectangular / Cylindrical
        String cargo;  // e.g., Petroleum, Food, Chemicals

        GoodsUnit(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Safety Validation System ===\n");

        // Step 1: Create list of goods bogies
        List<GoodsUnit> goodsList = new ArrayList<>();

        goodsList.add(new GoodsUnit("Rectangular", "Food"));
        goodsList.add(new GoodsUnit("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsUnit("Rectangular", "Textiles"));
        goodsList.add(new GoodsUnit("Cylindrical", "Petroleum")); // valid

        // Step 2: Define safety rule using functional interface (Predicate)
        Predicate<GoodsUnit> safetyRule = g ->
                !g.type.equals("Cylindrical") || g.cargo.equals("Petroleum");

        // Step 3: Apply rule using allMatch()
        boolean isSafe = goodsList.stream()
                .allMatch(safetyRule);

        // Step 4: Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}