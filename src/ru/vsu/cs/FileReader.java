package ru.vsu.cs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    static String readFile(String fileName) {
        String inputText = "";
        try {
            Scanner scanner = new Scanner(new File(fileName));
            inputText = scanner.nextLine();
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File not found!");
        }
        return inputText;
    }
}
