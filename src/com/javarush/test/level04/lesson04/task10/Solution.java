package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String aNum = buff.readLine();
        String bNum = buff.readLine();
        String cNum = buff.readLine();
        int a = Integer.parseInt(aNum);
        int b = Integer.parseInt(bNum);
        int c = Integer.parseInt(cNum);
        if (a==b&a==c&b==c) System.out.println(a+" "+b+" "+c);
        else if (a==b) System.out.println(a+" "+b);
        else if (a==c) System.out.println(a+" "+c);
        else if (b==c) System.out.println(b+" "+c);


    }
}