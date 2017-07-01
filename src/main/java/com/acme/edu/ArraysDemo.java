package com.acme.edu;

public class ArraysDemo {
    public static void main(String... args) {
        Integer variable = new Integer(5); //boxing
        variable.intValue(); //unboxing
        Integer.parseInt("45");

        Integer i = 5; //auto boxing
        int ii = i; //auto unboxing

        Integer i1 = 127; //+intern
        Integer i2 = 127;
        System.out.println(i1 == i2); //NNNOOOOOOOOO!!!!!! WTF?????
    }
}