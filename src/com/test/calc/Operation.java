package com.test.calc;

public class Operation {

    public enum OperationType {
        ADDITION,
        SUBTRACTION,
        MULTIPLICATION,
        DIVISION
    }

    private OperationType operation;

    public void set(String value) {
        switch (value) {
            case "+" -> this.operation = OperationType.ADDITION;
            case "-" -> this.operation = OperationType.SUBTRACTION;
            case "*" -> this.operation = OperationType.MULTIPLICATION;
            case "/" -> this.operation = OperationType.DIVISION;
            default -> throw new IllegalArgumentException("Exception: Unknown operation!");
        }
    }
    public OperationType getType() {
        return this.operation;
    }
}
