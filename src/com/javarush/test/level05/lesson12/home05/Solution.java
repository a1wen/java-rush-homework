package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String sNum;
        int sum = 0;
        String summa = "сумма";
        while(true){
            sNum = buff.readLine();
            if (sNum.equals(summa)) break;
            else sum += Integer.parseInt(sNum);
        }
        System.out.println(sum);
    }
}
