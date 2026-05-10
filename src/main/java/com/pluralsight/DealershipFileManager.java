package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class DealershipFileManager {

    //Methods
    public static Dealership getDealership(){
        Dealership ds = null;
        String inventory = "inventory.csv";



        try(BufferedReader br = new BufferedReader(new FileReader(inventory))) {
            // create dealership  from first line of file
            String line = br.readLine();
            if (line != null){
            String[] parts = line.split("\\|");
            //Initalize( new dealership)
            ds = new Dealership(parts[0],parts[1],parts[2]);
            }
            // While loop to load file
            while ((line = br.readLine()) != null){
               String[] parts2 = line.split("\\|");
               Vehicle vehicle = new Vehicle(Integer.parseInt(parts2[0]),
                                            Integer.parseInt(parts2[1]),
                                            Integer.parseInt(parts2[2]),
                                            parts2[3],parts2[4],
                                            parts2[5],parts2[6],
                                            Double.parseDouble(parts2[7]));
               ds.addVehicle(vehicle);
               // get access to dealership

            }return ds;

        } catch (Exception e) {
            System.err.println("Error" + e.getMessage());
        }
    }
    public void saveDealership(Dealership dealership){}
}
