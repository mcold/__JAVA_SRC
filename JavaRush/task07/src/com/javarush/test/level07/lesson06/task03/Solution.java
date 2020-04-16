package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    
    public static void main(String[] args)throws Exception{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter number of elements:");
        int n = Integer.parseInt(buf.readLine());
        System.out.println("---------------------");
        for(int i = 0; i < n; i++){
            list.add(list.size(), buf.readLine());
        }
        System.out.println("---------------------");
        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(list.size() - j - 1));
        }   
               
    }
    
}
