import java.util.Scanner;

//Rewards Converter class
public class RewardsConverter {
    
    //Entrypoint of program
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");

        // Read user input as a string
        var input_value = scanner.nextLine();

        // Declare variable to store the cash value as a double
        double cashValue;

        try {
            // Try to convert a String representing a numeric value into a double primitive type
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            // If parsing fails, print an error message and exit the program
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");

        // Create a RewardValue object using the parsed cash value
        var rewardsValue = new RewardValue(cashValue);

        // Print the result of the conversion: the equivalent miles value
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}