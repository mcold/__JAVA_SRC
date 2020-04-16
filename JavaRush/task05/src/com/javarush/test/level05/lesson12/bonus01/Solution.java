package com.javarush.test.level05.lesson12.bonus01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.
*/

public class Solution
{
   public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s1 = buf.readLine();
        String s2 = buf.readLine();
        int arg1 = Integer.parseInt(s1);
        int arg2 = Integer.parseInt(s2);
        int sum = arg1 + arg2;
        System.out.println("sum:" + sum);
    }
}
