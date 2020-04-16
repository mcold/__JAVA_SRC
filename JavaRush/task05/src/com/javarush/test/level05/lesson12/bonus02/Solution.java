package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of massive:");
        int size = Integer.parseInt(buf.readLine());
        System.out.println("--------------------");
        
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++){
            ar[i] = Integer.parseInt(buf.readLine());
        }
        int min = min(ar);
        int max = max(ar);
        int sum = sum(ar);
        System.out.println("--------------------");
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
    }


    public static int min(int[] ar)
    {
       int min = ar[0];
       for (int i = 0; i < ar.length; i++){
           if(ar[i] < min){
               min = ar[i];
           }
       }
       return min;
    }
    
    public static int max(int[] ar)
    {
       int max = ar[0];
       for (int i = 0; i < ar.length; i++){
           if(ar[i] > max){
               max = ar[i];
           }
       }
       return max;
    }
    
    public static int sum(int[] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++){
            sum += ar[i];
        }
        return sum;
    }

}
