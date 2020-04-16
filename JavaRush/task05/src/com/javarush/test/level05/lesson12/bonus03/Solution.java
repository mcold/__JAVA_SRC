package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array: ");
        int size = Integer.parseInt(buf.readLine());
        System.out.println("---------------------");
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++){
         ar[i] = Integer.parseInt(buf.readLine());
        }    
        int max = max(ar);
        System.out.println("---------------------");
        System.out.println("Maximum: " + max); 
    }
    
    
    public static int max(int[] ar){
        int max = ar[0];
        for(int i = 0; i < ar.length; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }
}
