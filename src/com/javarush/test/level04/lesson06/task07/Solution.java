package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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
        if (a==b) System.out.println(3);
        else if (a==c) System.out.println(2);
        else System.out.println(1);

    }
}
