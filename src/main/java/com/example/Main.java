/*
* File: Main.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft I N
* Date: 2026-03-23
* Github: https://github.com/BenedekSzasz/
* Licenc: MIT
*/

package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Járművek feldolgozása...\n");
        Solution.readContent();
        // Solution.printVehicleList();
        // Solution.gasolineVehicle();
        // Solution.cheaperVehicles();
        // Solution.moreThanAYear();
        Solution.onlyHonda();
    }
}