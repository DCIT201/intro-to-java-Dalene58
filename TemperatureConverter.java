import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        try (Scanner input = new Scanner(System.in)) {
            // Greet the user and ask for their name
            System.out.println("Hello, welcome to the Aithusa temperature converter. What is your name? : ");
            String name = input.nextLine(); // Read user's name
            
            // Greet the user by name and provide options for temperature conversion
            System.out.println("Hi " + name + " its so nice to meet you what would you be doing today? ");
            System.out.println("1. Converting Temperature from Celsius to Fahrenheit");
            System.out.println("2. Converting Temperature from Fahrenheit to Celsius");
            
            // Read the user's choice for conversion
            int choice = input.nextInt();
            
            // Handle the user's choice using a switch statement
            switch (choice) {
                case 1:
                    // Celsius to Fahrenheit conversion
                    System.out.println("Please enter your temperature in Celsius:");
                    double temp_C = input.nextDouble(); // Read Celsius temperature
                    // Check if the input temperature is within a valid range
                    if (temp_C < -273.15 || temp_C > 500.50) {
                        System.out.println("The temperature you have entered is invalid");
                    } else {
                        // Perform the conversion: (C * 9/5) + 32
                        double temp_F = (temp_C * 9 / 5) + 32;
                        System.out.println("Your temperature in Fahrenheit is " + temp_F);
                    }
                    break;

                case 2:
                    // Fahrenheit to Celsius conversion
                    System.out.println("Please enter your temperature in Fahrenheit:");
                    double temp_F = input.nextDouble(); // Read Fahrenheit temperature
                    // Check if the input temperature is within a valid range
                    if (temp_F < -459.67 || temp_F > 800.20) {
                        System.out.println("The temperature you have entered is invalid");
                    } else {
                        // Perform the conversion: (F - 32) * 5/9
                        double temp_Cel = (temp_F - 32) * 5 / 9;
                        System.out.println("Your temperature in Celsius is " + temp_Cel);
                    }
                    break;

                default:
                    // Handle invalid menu choices
                    System.out.println("Your choice is invalid");
                    break;
            }
        }
    }
}
