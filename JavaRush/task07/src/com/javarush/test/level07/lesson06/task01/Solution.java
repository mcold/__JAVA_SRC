package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    
    public static void main(String[] args) throws Exception{
        System.out.println("Enter number of elements: ");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(buf.readLine());
        
        System.out.println("--------------------------");
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < num; i++){
            list.add(buf.readLine());
        }
        System.out.println("--------------------------");
        System.out.println("Size of list: " + list.size());
        System.out.println("--------------------------");
        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
        
    }
}
