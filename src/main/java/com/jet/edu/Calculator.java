package com.jet.edu;

import java.io.File;

public class Calculator
{
    private static int memory;

    public void addToMemory(){
        //region test

        //sout
        System.out.println("adssa");

        byte q =0;
        short w = 07;
        int p = 0;
        //long l = 9999999999999; - не работает
        long e = 9999999999999L; // работает

        float f = 0.1F; // работает
        //float t = 0.1; не работает

        double ff = -3.13e-10;

        boolean rr = false;

        char v = '\uABCF';
        char vv = '\t';
        char vvv = '\n';


        System.out.println(v);
        //endregion
    }

    public static void main(String[] args) {
        System.out.println( "Hello World!" );
    }
}
