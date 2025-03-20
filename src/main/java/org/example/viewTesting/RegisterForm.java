package org.example.viewTesting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm {
    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("Register Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));  // GridLayout for organizing components

        // Create labels and text fields for the form
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        // Create a register button
        JButton registerButton = new JButton("Register");

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());  // Empty label for spacing
        panel.add(registerButton);

        // Add panel to frame
        frame.add(panel);

        // Event handling for the register button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                char[] password = passwordField.getPassword();

                // Validate input
                if (name.isEmpty() || email.isEmpty() || password.length == 0) {
                    JOptionPane.showMessageDialog(frame, "All fields must be filled!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Registration successful!\nName: " + name + "\nEmail: " + email);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
