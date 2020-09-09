package com.test.calc;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Operand a = new Operand(), b = new Operand();
        Operation operation = new Operation();

        Parser.parseInput("34 + 4", operation, a, b);

        out.println("ends...");
    }
}
