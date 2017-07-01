package com.jet.edu;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class CalculatorApp {

    public static void main(String[] args) {
        /*String par1 = args[0];
        String par2 = args[1];
        Double per1 = Double.parseDouble(par2);
        String par3 = args[2];
        Double per2 = Double.parseDouble(par3);
        switch (par1) {
            case "module" : System.out.println(calculator2.module(per1)); break;
            case "div" : System.out.println(calculator2.div(per1, per2)); break;
            case "sub" : System.out.println(calculator2.sub(per1, per2)); break;
            case "mul" : System.out.println(calculator2.mul(per1, per2)); break;
            case "sum" : System.out.println(calculator2.sum(per1, per2)); break;
        }*/
        /*String comand = "";
        String ag1 = "";
        String ag2 = "";
        int postion = 0;
        for (String i : args){
            if(postion++ == 0){
                comand = i;
            } else if (postion == 1){
                ag1 = i;
            }else {
                ag2 = i;
                postion = 0;
            }
        }*/
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

    public static void doCalculate(String operator, Double arg1, Double arg2) {
        switch (operator) {
            case "module":
                System.out.println(calculator2.module(arg1));
                break;
            case "div":
                stringLog(arg1 + " " + operator + " " + arg2 + " = " + calculator2.div(arg1, arg2));
                break;
            case "sub":
                stringLog(arg1 + " " + operator + " " + arg2 + " = " + calculator2.sub(arg1, arg2));
                break;
            case "mul":
                stringLog(arg1 + " " + operator + " " + arg2 + " = " + calculator2.mul(arg1, arg2));
                break;
            case "sum":
                stringLog(arg1 + " " + operator + " " + arg2 + " = " + calculator2.sum(arg1, arg2));
                break;
        }
    }

    public static String stringLog(String... b) {
        String result = "";
        for (String current : b) {
            result = result + current;
        }

        System.out.println(result);
        return result;
    }
}