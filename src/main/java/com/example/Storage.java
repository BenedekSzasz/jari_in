package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Storage {
    public static List<Vehicle> readFile() {
        try {
            return tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    private static List<Vehicle> tryReadFile() throws FileNotFoundException {
        List<Vehicle> vehicleList = new ArrayList<>();
        File file = new File("jaribt.txt");
        Scanner sc = new Scanner(file);

        return vehicleList;
    }
}
