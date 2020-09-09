package com.test.calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
    public static void printLine(String val) {
        System.out.println(val);
    }

    public static String readLine() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result = "";

        try {
            result = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
