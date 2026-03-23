/*
* File: Solution.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft I N
* Date: 2026-03-23
* Github: https://github.com/BenedekSzasz/
* Licenc: MIT
*/

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
