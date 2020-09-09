package com.test.calc;

public class Operand {
    public enum OperandFormat {
        DECIMAL,
        ROMAN
    }
    OperandFormat format;
    int value;

    Operand(String input) {
        try {
            value = Integer.parseInt(input);
            this.format = OperandFormat.DECIMAL;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Exception: Unknown format of argument!");
        }
    }

}
