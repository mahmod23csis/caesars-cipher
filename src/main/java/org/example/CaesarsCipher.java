package org.example;

public class CaesarsCipher {
    private static final char LETTER_A = 'a';
    private static final char LETTER_Z = 'z';
    private static final int ALPHABET_SIZE = 26;

    public String cipher(String message, int offset) {
        offset %= ALPHABET_SIZE; // Not exceed 26
        char[] character = message.toCharArray(); // Transfer message to character array
        offsetBy(offset, character);
        return new String(character);
    }

    private static void offsetBy(int offset, char[] character) {
        for (int i = 0; i < character.length; i++) {
            if (character[i] != ' ') {
                character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
            }
        }
    }

    private static char offsetChar(char c, int offset, char letterA, char letterZ) {
        c += offset;
        if (c < letterA) {
            return (char) (c + ALPHABET_SIZE);
        }
        if (c > letterZ) {
            return (char) (c - ALPHABET_SIZE);
        }
        return c;
    }
}
