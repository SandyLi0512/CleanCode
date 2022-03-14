package com.epam.engx.cleancode.naming.task6;

public class Formatter {

    private static final String plus = "+";
    private static final String pipe = "|";
    private static final String minus = "-";
    private static final String underscore = " _ ";


    public String formatKeyValue(String key, String value) {
        String content = key + underscore + value;
        String minuses = repeat(minus, content.length());
        return plus +  minuses + plus + "\n"
                + pipe + content + pipe + "\n"
                + plus + minuses + plus + "\n";
    }

    private String repeat(String symbol, int times) {
        String result = "";
        for (int i = 0; i < times; i++)
            result += symbol;
        return result;
    }
}
