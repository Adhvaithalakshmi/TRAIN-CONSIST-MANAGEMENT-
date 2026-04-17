import java.util.Scanner;
import java.util.regex.*;

public class UC11_Validation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Train ID & Cargo Code Validation ===\n");

        // Step 1: Define regex patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Step 2: Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Step 3: Take user input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainInput = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoInput = sc.nextLine();

        // Step 4: Create matcher objects
        Matcher trainMatcher = trainPattern.matcher(trainInput);
        Matcher cargoMatcher = cargoPattern.matcher(cargoInput);

        // Step 5: Validate using matches()
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID ✅");
        } else {
            System.out.println("Invalid Train ID ❌");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code ✅");
        } else {
            System.out.println("Invalid Cargo Code ❌");
        }

        sc.close();
    }
}