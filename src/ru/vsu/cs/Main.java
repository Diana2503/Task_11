package ru.vsu.cs;

public class Main {

    public static void main(String[] args) throws Exception {
        String text = FileReader.readFile(args[0]);
        StringBuffer newText = StringHandler.createNewTextWithNumbering(text);
        FileWriter.writeFile(newText, args[1]);
    }
}
