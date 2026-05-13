package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    //Attributes
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    //Constructor

    public Dealership() {
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
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        for (Vehicle v : inventory){
            if (v.getPrice() == min) {
                return this.inventory;
            } else if (v.getPrice() == max) {
                return this.inventory;
            }
        }
        return this.inventory;
    }
    public ArrayList<Vehicle> getVehicleByMileage(int min, int max){
    }
    public ArrayList<Vehicle>getVehicleByYear(int min, int max){}
    public ArrayList<Vehicle>getVehicleByMakeModel(String make, String model){}
    public ArrayList<Vehicle>getVehicleByColor(String color){}
    public ArrayList<Vehicle>getVehicleByType(String vehicleType){}
    public ArrayList<Vehicle> getAllVehicles(){
        return this.inventory;
    }
    // Helper Methods
    public void addVehicle(Vehicle vehicle){
            // Create a new inventory object with the input parameter
            inventory.add(vehicle);
    }
    public  void removeVehicle(Vehicle vehicle){}
}
