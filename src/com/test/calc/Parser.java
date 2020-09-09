package com.test.calc;

public class Parser {
    public static void parseInput(String input, Operation operation, Operand a, Operand b) {

        if (input.startsWith(" ") || input.endsWith(" "))
            throw new IllegalArgumentException("Exception: unsupported type of string!");

        String[] words = input.split(" ");

        if (words.length != 3)
            throw new IllegalArgumentException("Exception: unsupported type of string!");

        a.set(words[0]);
        b.set(words[2]);
        operation.set(words[1]);
    }
}
