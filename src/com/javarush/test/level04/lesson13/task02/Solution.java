package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String sM = buff.readLine();
        String sN = buff.readLine();
        int m = Integer.parseInt(sM);
        int n = Integer.parseInt(sN);
        for (; m > 0; m--) {
            for (int i = n; i > 0; i--) {
                System.out.print(8);
            } System.out.println();
        }

    }
}
