package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {;
        Map<String, Integer> nameCounts = new HashMap<>();


        try (BufferedReader br = new BufferedReader(new FileReader("nume.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split(" ");
                if (parts.length >= 2) {
                    String fullName = parts[0] + " " + parts[1];
                    nameCounts.put(fullName, nameCounts.getOrDefault(fullName, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            if (entry.getValue() >= 3) {
                System.out.println(entry.getKey());
            }
        }
    }
}
