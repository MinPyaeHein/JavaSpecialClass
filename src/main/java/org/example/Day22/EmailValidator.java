package org.example.Day22;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        // Define the email validation regex
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Compile the regex
        Pattern pattern = Pattern.compile(emailRegex);

        // Match the input email with the pattern
        Matcher matcher = pattern.matcher(email);

        // Return whether the email matches the regex
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test the email validator
        String[] testEmails = {
                "u6511684@au.edu",
                "example@example.com",
                "user.name_tag+sorting@do+main.com",
                "invalid-email@.com",
                "plainaddress",
                "@missingusername.com"
        };

        for (String email : testEmails) {
            System.out.println(email + " is valid: " + isValidEmail(email));
        }
    }
}
