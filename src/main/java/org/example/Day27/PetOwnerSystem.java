package org.example.Day27;

import org.example.Day27.service.PetService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetOwnerSystem {
    public static void main(String[] args) throws IOException {
        PetService petService = new PetService();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter owner's phone:");
        String phone=reader.readLine();
        petService.displayPetsByOwnerPhone(phone);

    }
}
