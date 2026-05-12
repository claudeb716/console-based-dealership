package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class DealershipFileManager {
    //Attribute(Properties)
    private static final String inventory = "inventory.csv";


    //Methods
    public Dealership getDealership() {
        Dealership ds = new Dealership();

        try (BufferedReader br = new BufferedReader(new FileReader(inventory))) {
            // create dealership  from first line of file
            String firstLine = br.readLine();
            //Initialize( new dealership)
            String[] parts = firstLine.split("\\|");
            ds = new Dealership(parts[0], parts[1], parts[2]);
            // Loop Vehicles only
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts2 = line.split("\\|");
                Vehicle vehicle = new Vehicle(Integer.parseInt(parts2[0]),
                        Integer.parseInt(parts2[1]),
                        Integer.parseInt(parts2[2]),
                        parts2[3], parts2[4],
                        parts2[5], parts2[6],
                        Double.parseDouble(parts2[7]));
                ds.addVehicle(vehicle);
            }
        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
        }
        return ds;
    }
    public void saveDealership(Dealership dealership){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(inventory))){
           //Instance
            ArrayList<Vehicle> allVehicles = dealership.getAllVehicles();
           // Over-write file
            bw.write(dealership.getName()+ "|" + dealership.getAddress() + "|" + dealership.getPhone() + "\n");
        //loop through Vehicles
        for(Vehicle v : allVehicles){
            bw.write(v.getVin() + "|" + v.getYear() + "|" + v.getModel() + "|" + v.getModel()
            + "|" + v.getVehicleType() + "|" + v.getColor() + "| " + v.getOdometer() + "|" + v.getPrice());
        }
        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
