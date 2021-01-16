package ru.vsu.cs;

public class FileWriter {
    static void writeFile(StringBuffer textBuffer, String fileName) throws Exception {
        java.io.FileWriter fileWriter = new java.io.FileWriter(fileName);
        fileWriter.write(String.valueOf(textBuffer));
        fileWriter.close();
    }
}
