public class UC15_CargoSafety {

    // Step 1: Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String message) {
            super(message);
        }
    }

    // Step 2: Goods Bogie Class
    static class GoodsUnit {
        String shape;  // Rectangular / Cylindrical
        String cargo;

        GoodsUnit(String shape) {
            this.shape = shape;
        }

        // Method to assign cargo with validation
        void assignCargo(String cargo) {
            System.out.println("Assigning cargo: " + cargo + " to " + shape + " bogie");

            // Step 3: Business rule validation
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe Assignment! Petroleum cannot be loaded in Rectangular bogie.");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully ✅");
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Cargo Safety Assignment System ===\n");

        GoodsUnit g1 = new GoodsUnit("Rectangular");
        GoodsUnit g2 = new GoodsUnit("Cylindrical");

        // Step 4: try-catch-finally handling
        try {
            g1.assignCargo("Petroleum");  // ❌ Unsafe (will throw exception)
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operation completed for Rectangular bogie.\n");
        }

        try {
            g2.assignCargo("Petroleum");  // ✅ Safe
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operation completed for Cylindrical bogie.\n");
        }

        System.out.println("Program continues safely...");
    }
}