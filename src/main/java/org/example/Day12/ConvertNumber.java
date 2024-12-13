package org.example.Day12;

public class ConvertNumber {


    public static int convertToInt(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Input value cannot be null or empty.");
        }

        // Trim any surrounding quotes and whitespace
        value = value.replaceAll("^'+|'+$", "").trim();

        // Debug print to verify the processed value
        System.out.println("Processed value: " + value);

        // Convert the cleaned value to an integer
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: '" + value + "'. Please provide a valid integer string.");
        }
    }


    public static void main(String[] args) {
            // Test cases
            System.out.println(convertToInt("''''''-67574'''''")); // Output: -67574
            System.out.println(convertToInt("'''''-353535'''"));   // Output: -353535
            System.out.println(convertToInt("'12345'"));           // Output: 12345
            System.out.println(convertToInt("'+24234'"));          // Output: 24234
            System.out.println(convertToInt("'0'"));
            System.out.println(convertToInt("'-70099")); // Output: 0
        }

}
