package com.example;

import java.util.List;

public class Solution {

    static List<Vehicle> vehicleList;
    public static void readContent() {
        vehicleList = Storage.readFile();
    }

    public static void printVehicleList(){
        vehicleList.forEach(vehicle -> {
            System.out.println(vehicle.getBrand());
        });
    }
}
