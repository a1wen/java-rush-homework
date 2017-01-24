package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        if (a>b&&a>c) {
            if (b>c) System.out.println(a+" "+b+" "+c);
            else System.out.println(a+" "+c+" "+b);
        } else if (b>a&&b>c){
            if (a>c) System.out.println(b+" "+a+" "+c);
            else System.out.println(b+" "+c+" "+a);
        } else if(c>a&&c>b){
            if (a>b) System.out.println(c+" "+a+" "+b);
            else System.out.println(c+" "+b+" "+a);
        }

    }
}
