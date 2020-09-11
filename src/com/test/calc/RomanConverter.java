package com.test.calc;

import java.util.TreeMap;

public class RomanConverter {

    private final static TreeMap<Integer, String> abc = new TreeMap<>();

    static {
        abc.put(100, "C");
        abc.put(90, "XC");
        abc.put(50, "L");
        abc.put(40, "XL");
        abc.put(10, "X");
        abc.put(9, "IX");
        abc.put(5, "V");
        abc.put(4, "IV");
        abc.put(1, "I");

    }

    public static int parse(String value) {
        return switch (value) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new IllegalArgumentException("Exception: Unsupported format!");
        };
    }

    public static String toRoman(int value) {
        if (value == 0)
            return "0";
        if (value < 0)
            return "-"+convert(value * -1);
        return convert(value);
    }

    private static String convert(int number) {
        int l = abc.floorKey(number);
        if (number == l)
            return abc.get(number);
        return abc.get(l) + convert(number - l);
    }

}
