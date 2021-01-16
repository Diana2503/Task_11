package ru.vsu.cs;

public class StringHandler {
    public static StringBuffer createNewTextWithNumbering(String text) {
        StringBuffer textBuffer = new StringBuffer(text);
        char point = '.';
        char exclamationMark = '!';
        char questionMark = '?';
        int sentenceNumber = 1;

        for (int i = 0; i < textBuffer.length(); i++) {
            if (textBuffer.charAt(i) == (point) || textBuffer.charAt(i) == (exclamationMark) || textBuffer.charAt(i) == (questionMark)) {
                textBuffer.insert(i + 1, "[" + sentenceNumber + "]");
                sentenceNumber++;
            }
        }
        return textBuffer;
    }
}
