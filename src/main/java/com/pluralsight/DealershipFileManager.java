package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DealershipFileManager {
    //Attribute
    private static String inventory = "inventory.csv";


    //Methods
    public static Dealership getDealership() {
        Dealership ds = new Dealership();

        try (BufferedReader br = new BufferedReader(new FileReader(inventory))) {
            // create dealership  from first line of file
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                //Initialize( new dealership)
                ds = new Dealership(parts[0], parts[1], parts[2]);
                Vehicle vehicle = new Vehicle(Integer.parseInt(parts[3]),
                        Integer.parseInt(parts[4]),
                        Integer.parseInt(parts[5]),
                        parts[6], parts[7],
                        parts[8], parts[9],
                        Double.parseDouble(parts[10]));
                ds.addVehicle(vehicle);
            }
        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
        }
        return ds;
    }
    public void saveDealership(Dealership dealership){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(inventory, true))){
        //bw.write();
        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}
