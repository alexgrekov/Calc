package com.test.calc;

public class Operand {
    public enum OperandFormat {
        DECIMAL,
        ROMAN
    }

    private OperandFormat format;
    private int value;

    public void set(String input) {
        try {
            this.value = Integer.parseInt(input);
            this.format = OperandFormat.DECIMAL;

        } catch (NumberFormatException e) {
            this.value = RomanConverter.parse(input);
            this.format = OperandFormat.ROMAN;
        }
        if (this.value < 1 || this.value > 10)
            throw new IllegalArgumentException("Exception: operand can not be <1 or >10!");
    }

    public void set(int input, OperandFormat format) {
        this.value = input;
        this.format = format;
    }

    public OperandFormat getFormat() {
        return format;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        String result = "";
        switch (this.format) {
            case DECIMAL -> result = Integer.toString(value);
            case ROMAN -> result = RomanConverter.toRoman(value);
        }
        return result;
    }
}
