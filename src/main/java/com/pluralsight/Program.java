package com.pluralsight;

import java.util.Scanner;

public class Program {

    // This is the main method where the program execution starts.
    public static void main(String[] args) {

    }
    // This method is used to list all the vehicles currently in the inventory
    public static void listAllVehicles() {
        // Print a header for the vehicle inventory
        System.out.println("Vehicle inventory:");

        // Iterate over the array of vehicles and print the details of each vehicle
        for (int i = 0; i < numVehicles; i++) {
            System.out.println(vehicles[i]);
        }
    }

    public static void findVehiclesByMakeModel(Scanner scanner) {
        // Prompt the user to enter the make and model of the vehicle they want to find
        System.out.print("Enter make and model: ");
        String makeModel = scanner.nextLine();

        // Set a boolean variable `found` to false
        boolean found = false;

        // Loop through the vehicles array
        for (int i = 0; i < numVehicles; i++) {
            // If the make and model of the current vehicle matches the user-entered make and model
            if (vehicles[i].getMakeModel().equalsIgnoreCase(makeModel)) {
                // Print the details of the matching vehicle to the console
                System.out.println(vehicles[i]);
                // Set `found` to true
                found = true;
            }
        }

        // If no matching vehicle was found, print a message to the console
        if (!found) {
            System.out.println("No vehicles found");
        }
    }

    public static void findVehiclesByPrice(Scanner scanner) {
        // Prompt user to enter minimum price
        System.out.print("Enter minimum price: ");
        float minPrice = scanner.nextFloat();

        // Prompt user to enter maximum price
        System.out.print("Enter maximum price: ");
        float maxPrice = scanner.nextFloat();

        // Set a flag to determine if any matching vehicles were found
        boolean found = false;

        // Loop through the vehicles array
        for (int i = 0; i < numVehicles; i++) {

            // Check if the current vehicle's price is within the given price range
            if (vehicles[i].getPrice() >= minPrice && vehicles[i].getPrice() <= maxPrice) {

                // If the current vehicle's price is within the range, print its details
                System.out.println(vehicles[i]);

                // Set the flag to true, indicating at least one matching vehicle was found
                found = true;
            }
        }

        // If no matching vehicles were found, print a message
        if (!found) {
            System.out.println("No vehicles found");
        }
    }


    public static void findVehiclesByColor(Scanner scanner) {
        // Prompt user to enter a color
        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        // Initialize a boolean variable to keep track if any vehicles with the entered color are found
        boolean found = false;
        // Iterate through the vehicles array
        for (int i = 0; i < numVehicles; i++) {
            // Check if the current vehicle has the entered color
            if (vehicles[i].getColor().equalsIgnoreCase(color)) {
                // If the vehicle has the entered color, print out its details
                System.out.println(vehicles[i]);
                // Set found to true to indicate that at least one vehicle with the entered color was found
                found = true;
            }
        }

        // If no vehicles with the entered color were found, print out a message to the user
        if (!found) {
            System.out.println("No vehicles found");
        }
    }
}
