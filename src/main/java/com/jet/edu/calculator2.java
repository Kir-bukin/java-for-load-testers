package com.jet.edu;
public class calculator2 {
    public static int sum(int a, int b) {
        return restriction(a + b);
    }
    public static double sum(double a, double b) {
        return restriction(a + b);
    }

    public static int sub(int a, int b) {
        return restriction(a - b);
    }
    public static double sub(double a, double b) {
        return restriction(a - b);
    }

    public static int mul(int a, int b) {
        return restriction(a * b);
    }
    public static double mul(double a, double b) {
        return restriction(a * b);
    }

    public static int div(int a, int b) { return restriction(a / b);}
    public static double div(double a, double b) {
        if(b == 0){
            return 0.;
        }
        return restriction(a / b);
    }
    public static int module(int w){
        if(w < 0){
            w = -w;
        }
        return restriction(w);
    }
    public static double module(double w){
        if(w < 0){
            w = -w;
        }
        return restriction(w);
    }
    public static double restriction(double w){
        if(w >= -10 & w <= 10) {
            return w;
        }else{
            if(w > 10){
                return 10;
            }else{
                return -10;
            }
        }
    }
    public static int restriction(int w){
        if(w >= -10 & w <= 10) {
            return w;
        }else{
            if(w > 10){
                return 10;
            }else{
                return -10;
            }
        }
    }
}