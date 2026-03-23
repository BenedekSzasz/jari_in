package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Storage {
    public void readFile() {
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    private void tryReadFile() throws FileNotFoundException {
        File file = new File("jaribt.txt");
        
        Scanner sc = new Scanner(file);
    }
}
