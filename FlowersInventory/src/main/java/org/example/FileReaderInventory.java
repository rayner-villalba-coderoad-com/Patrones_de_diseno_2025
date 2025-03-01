package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderInventory {
    private String pathFile;

    public FileReaderInventory(String path) {
        this.pathFile = path;
    }

    public String readFileContent() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader buffer = new BufferedReader(new FileReader(pathFile))) {
            String line;

            // Condition check via buffer.readLine() method
            // holding true upto that the while loop runs
            while ((line = buffer.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch ( IOException e) {
            e.printStackTrace();
        }

        // Returning a string
        return content.toString();
    }
}
