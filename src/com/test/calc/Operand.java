package com.test.calc;

public class Operand {
    public enum OperandFormat {
        DECIMAL,
        ROMAN
    }

    private OperandFormat format;
    int value;

    public void set(String input) {
        try {
            this.value = Integer.parseInt(input);
            this.format = OperandFormat.DECIMAL;
            if (this.value < 1 || this.value > 10)
                throw new IllegalArgumentException("Exception: operand can not be <1 or >10!");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Exception: Unknown format of argument!");
        }
    }

}
