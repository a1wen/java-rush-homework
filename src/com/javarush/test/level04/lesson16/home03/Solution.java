package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int a =0 ,b = 0,c = 0;
        while (a!=-1||b!=-1||c!=-1){
            String sA = buff.readLine();
            String sB = buff.readLine();
            String sC = buff.readLine();
            a = Integer.parseInt(sA);
            b = Integer.parseInt(sB);
            c = Integer.parseInt(sC);
            int sum = a+b+c;
            System.out.println(sum);
            if(a==-1||b==-1||c==-1) break;
        }
    }
}
