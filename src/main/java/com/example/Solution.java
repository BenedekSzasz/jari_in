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

import java.time.LocalDate;
import java.util.List;

public class Solution {

    static List<Vehicle> vehicleList;

    public static void readContent() {
        vehicleList = Storage.readFile();
    }

    public static void printVehicleList() {
        vehicleList.forEach(vehicle -> {
            System.out.println(vehicle.getBrand());
        });
    }

    public static void gasolineVehicle() {
        System.out.println("\nBenzines Járművek:");
        // Benzines Járművek adatai
        vehicleList.forEach(vehicle -> {
            if (vehicle.getFuel().equals("benzin")) {
                System.out.printf(
                        "%s %s %d %s %d %s %s\n",
                        vehicle.getPlate(),
                        vehicle.getBrand(),
                        vehicle.getYear(),
                        vehicle.getFuel(),
                        vehicle.getPrice(),
                        vehicle.isClimate() ? "van" : "nincs",
                        vehicle.getPermission());

            }
            System.out.println(vehicle.getBrand());
        });
    }

    public static void cheaperVehicles() {
        System.out.println("Egy milliónál olcsóbb járművek adatai: \n");
        // A legolcsobb járművek adatai
        vehicleList.forEach(vehicle -> {
            if (vehicle.getPrice() < 1000000) {
                System.out.printf(
                        "%s %s %d %s %d %s %s\n",
                        vehicle.getPlate(),
                        vehicle.getBrand(),
                        vehicle.getYear(),
                        vehicle.getFuel(),
                        vehicle.getPrice(),
                        vehicle.isClimate() ? "van" : "nincs",
                        vehicle.getPermission());
            }
        });
    }

    public static void moreThanAYear() {
        System.out.println("Egy évnél több műszakival rendelkező járművek listája: \n");
        // Azon a járműveknek az adatai, amelyeknek a műszakija több mint 1 év
        vehicleList.forEach(vehicle -> {
            if (LocalDate.now().getYear() - vehicle.getPermission().getYear() > 1) {
                System.out.printf(
                        "%s %s %d %s %d %s %s\n",
                        vehicle.getPlate(),
                        vehicle.getBrand(),
                        vehicle.getYear(),
                        vehicle.getFuel(),
                        vehicle.getPrice(),
                        vehicle.isClimate() ? "van" : "nincs",
                        vehicle.getPermission());
            }
        });
    }

    public static void onlyHonda(){
        System.out.println("Csak a Honda márkájú autók adatai: \n");
        // Csak a Honda márkájú autók adatai
        vehicleList.forEach(vehicle -> {
            if (vehicle.getBrand().equals("Honda")) {
                System.out.printf(
                        "%s %s %d %s %d %s %s\n",
                        vehicle.getPlate(),
                        vehicle.getBrand(),
                        vehicle.getYear(),
                        vehicle.getFuel(),
                        vehicle.getPrice(),
                        vehicle.isClimate() ? "van" : "nincs",
                        vehicle.getPermission());
            }
        });
    }
}
