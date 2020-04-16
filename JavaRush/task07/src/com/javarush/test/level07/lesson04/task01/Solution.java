package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution {
    
    public static void main(String[] args) throws Exception{
        int max = initializeArray();
        System.out.println(max);
    }    
    
    public static int initializeArray() throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int[] ar = new int[20];
        for(int i = 0; i < 10; i++){
            ar[i] = Integer.parseInt(buf.readLine());
         }
        for(int j = 0; j < ar.length; j++){
            if(ar[j] > max){
                max = ar[j];
            }
        }
        return max;
    }
}
