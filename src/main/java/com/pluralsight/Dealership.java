package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    //Attributes
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;
    // Initialize an array of Vehicle objects with a maximum size of 20.
    private static Vehicle[] vehicles = new Vehicle[20];

    // The number of vehicles currently stored in the vehicles array.
    private static int numVehicles = 6;

    //Constructor

    public Dealership() {
        this.inventory = new ArrayList<>();
    }

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    // Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    // Derived getters//Methods
    public static List<Vehicle> getVehiclesByPrice(double min, double max){
        return;
    }
    public static List<Vehicle> getVehicleByMileage(int min, int max){ return min, max;}
    public static List<Vehicle> getVehicleByYear(int min, int max){return min, max;}
    public static List<Vehicle> getVehicleByMakeModel(String make, String model){return make, model}
    public static List<Vehicle> getVehicleByColor(String color){return color;}
    public static List<Vehicle> getVehicleByType(String vehicleType){return vehicleType;}
    public static List<Vehicle> getAllVehicles(){
        return this.inventory;
    }
    // Helper Methods
    public void addVehicle(Vehicle vehicle){
            // Create a new inventory object with the input parameter
            inventory.add(vehicle);
    }
    public static void removeVehicle(Vehicle vehicle){}
}
