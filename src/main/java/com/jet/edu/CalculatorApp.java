package com.jet.edu;

import static java.lang.Double.parseDouble;

public class CalculatorApp {

    public static void main(String[] args) {

        String command = "";
        String arg1 = "";
        String arg2 = "";
        int position = 0;

        for (String current : args) {
            switch (position++) {
                case 0:
                    command = current;
                    break;
                case 1:
                    arg1 = current;
                    break;
                case 2: {
                    arg2 = current;
                    doCalculate(command, parseDouble(arg1), parseDouble(arg2));
                    position = 0;
                }
            }
        }

    }


    private static void doCalculate(String operator, Double arg1, Double arg2) {
        String Variables = arg1 + " " + operator + " " + arg2 + " = ";
        switch (operator) {
            case "module":
                System.out.println(calculator2.module(arg1));
                break;
            case "div":
                WriteToLog(Variables + calculator2.div(arg1, arg2));
                break;
            case "sub":
                WriteToLog(Variables + calculator2.sub(arg1, arg2));
                break;
            case "mul":
                WriteToLog(Variables + calculator2.mul(arg1, arg2));
                break;
            case "sum":
                WriteToLog(Variables + calculator2.sum(arg1, arg2));
                break;
            default: {
                System.out.println("Wrong parameter!");
            }
        }
    }

    private static String WriteToLog(String... args) {
        StringBuilder result = new StringBuilder();
        for (String current : args) {
            result.append(current);
        }

        System.out.println(result);
        return result.toString();
    }
}