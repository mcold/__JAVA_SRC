package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/


public class Solution {
    
    public static void main(String[] args) throws Exception{
        
        String[] ar = new String[10];
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 8; i++){
            ar[i] = buf.readLine();
        }
        for(int j = ar.length-1; j < 0; j--){
            System.out.println(ar[j]);
        }
        for (int i = 0; i < ar.length; i++)
        {
            System.out.println(ar[10-i-1]);
        }
    }
}
