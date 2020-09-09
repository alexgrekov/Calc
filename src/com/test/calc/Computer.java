package com.test.calc;

public class Computer {
    public static void calc(Operation operation, Operand a, Operand b, Operand resultOperand) {
        if (a.getFormat() != b.getFormat())
            throw new IllegalArgumentException("Exception: I can compute only same format operands!");
        int result = 0;
        switch (operation.getType()) {
            case ADDITION -> result = a.getValue() + b.getValue();
            case SUBTRACTION -> result = a.getValue() - b.getValue();
            case MULTIPLICATION -> result = a.getValue() * b.getValue();
            case DIVISION -> result = a.getValue() / b.getValue();
        }
        resultOperand.set(result, a.getFormat());
    }
}
