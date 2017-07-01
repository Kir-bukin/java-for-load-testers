package com.jet.edu;

import java.io.File;
import java.math.BigDecimal;

public class PrimitivesDemo {
    private static int i;
    private static String s = new String();

    public static void main(String[] args) {
        //region Целочисленные
        byte b = 0; //0..255 | -127..128
        short s = 07; //-32000..32000
        int i = 0xA;
        long l = 9999999999999L;
        //endregion

        //region Overflow
        byte counter = Byte.MIN_VALUE;
        for (int ii = 0; ii < 300; ii++) {
            counter++; //counter = counter + 1;
        }
        System.out.println(counter);
        //endregion

        //region Плавающая точка
        float f = 0.F;
        double d = -3.14e-10;
        //endregion

        //region Потеря точности
        System.out.println(0.1 + 0.2); //IEEE 3xx
        //endregion

        //region Логический тип
        boolean bb = true | false;
        //endregion

        //region Символ
        char c = '\u1234'; //'\n'; //File.separator
        System.out.println("1" + c + "2");
        //endregion

        //region Ссылочные типы
        String ss = new String();
        ss = null;
        //endregion

    }
}