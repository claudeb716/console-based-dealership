package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    // Attributes
    Dealership dealership = new Dealership();

    //Constructor

    public UserInterface() {
    }
    // Derived getters/Methods
    public void display(){
        // call method to load dealership
        DealershipFileManager.getDealership();

        // Create a Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        boolean isDone = false;

        // Run a loop until the user quits the program.
        while (!isDone) {

            // Display the options menu to the user.
            System.out.println("What do you want to do?");
            System.out.println("  1 - List All Vehicles");
            System.out.println("  2 - Search by Make/Model");
            System.out.println("  3 - Search by Price range");
            System.out.println("  4 - Search by Color");
            System.out.println("  5 - Search by Mileage range");
            System.out.println("  6 - Search by Type(Car,Truck,Van,SUV)");
            System.out.println("  7 - Add a Vehicle");
            System.out.println("  8 - Remove a Vehicle");
            System.out.println("  9 - Quit");
            System.out.println("Enter your command:");

            // Read the user's input command.
            int command = scanner.nextInt();

            // Consume the newline character left in the scanner buffer after reading the command.
            scanner.nextLine();

            // Use a switch statement to call the appropriate method based on the user's input command.
            switch (command) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                case 9:
                    processRemoveVehicleRequest();
                case 0:
                    // Display a message to the user and exit the program.
                    System.out.println("Goodbye!");
                    isDone = true;
                    break;
                default:
                    // Display an error message if the user inputs an invalid command.
                    System.out.println("Invalid command.");
                    break;
            }
        }

    }
    public void processGetByPriceRequest(){}
    public void processGetByMakeModelRequest(){}
    public void processGetByYearRequest(){}
    public void processGetByColorRequest(){}
    public void processGetByMileageRequest(){}
    public void processGetByVehicleTypeRequest(){}
    public void processGetAllVehiclesRequest(){}
    public void processAddVehicleRequest(){}
    public void processRemoveVehicleRequest(){}
}
