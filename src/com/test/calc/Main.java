package com.test.calc;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        Operand a = new Operand(), b = new Operand(), result = new Operand();
        Operation operation = new Operation();
        String inputLine;

        inputLine = IO.readLine();
        Parser.parseInput(inputLine, operation, a, b);

        Computer.calc(operation, a, b, result);
        IO.printLine(result.toString());
    }
}
