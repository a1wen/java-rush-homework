package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String sA = buff.readLine();
        String sB = buff.readLine();
        String sC = buff.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        if (a>b&&a<c||a<b&&a>c) System.out.println(a);
        else if (b>a&&b<c||b<a&&b>c) System.out.println(b);
        else System.out.println(c);

    }
}
