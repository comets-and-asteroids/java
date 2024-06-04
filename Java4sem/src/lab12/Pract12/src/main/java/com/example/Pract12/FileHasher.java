package com.example.Pract12;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.io.*;
import java.nio.file.*;
import java.security.MessageDigest;

@Component
public class FileHasher {
    @Value("#{springApplicationArguments.nonOptionArgs[1]}")
    private String outputFile;
    @Value("#{springApplicationArguments.nonOptionArgs[0]}")
    private String inputFile;

    @PostConstruct
    private void onConstruct() {
        try {
            if (outputFile == null) {
                System.out.println("No args");
            }

            else if (inputFile == null) {
                Files.writeString(Path.of(outputFile), "null\n", StandardOpenOption.CREATE);
                System.out.println("Old file not specified. The new one contains 'null'");
            }

            else {
                String oldText = Files.readString(Path.of(inputFile));
                String newText = "null\n";
                if (!oldText.isEmpty()) {
                    String hashCode = String.valueOf(oldText.hashCode());
                    newText = hashCode + "\n";
                }
                Files.writeString(Path.of(outputFile), newText, StandardOpenOption.CREATE);
                System.out.println("The contents of the old file were hashed and placed into the new one");
            }
        } catch (NoSuchFileException e) {
            System.out.println("File not found: " + e.getFile());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @PreDestroy
    public void preDestroy() {
        try {
            if (inputFile != null && outputFile != null) {
                Files.delete(Path.of(inputFile));
                System.out.println("Old file was deleted");
            }
        } catch (NoSuchFileException e) {
            System.out.println("The file to be deleted was not found: " + e.getFile());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
