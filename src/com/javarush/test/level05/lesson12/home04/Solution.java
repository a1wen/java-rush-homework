package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {
        long curTime = System.currentTimeMillis();

// Хотите значение типа Date, с этим временем?
        Date curDate = new Date(curTime);

// Хотите строку в формате, удобном Вам?
        String curStringDate = new SimpleDateFormat("dd MM yyyy").format(curTime);
        System.out.println(curStringDate);

    }
}
