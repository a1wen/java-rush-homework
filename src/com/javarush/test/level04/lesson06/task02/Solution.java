package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String sA = buff.readLine();
        String sB = buff.readLine();
        String sC = buff.readLine();
        String sD = buff.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int d = Integer.parseInt(sD);
        if (a>b&&a>c&&a>d) System.out.println(a);
        else if(b>a&&b>c&&b>d) System.out.println(b);
        else if(c>a&&c>b&&c>d) System.out.println(c);
        else System.out.println(d);

    }
}
