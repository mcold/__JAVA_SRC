package com.javarush.test.level08.lesson03.task04;

/* Вывести на экран список ключей
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк. Вывести на экран список ключей, каждый элемент с новой строки.
*/

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    
    public static void main(String[] args) throws Exception{
        
        HashMap<String, String> map = new HashMap<String, String>();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number of elements: ");
        int n;
        n = Integer.parseInt(buf.readLine());
        System.out.println("-----------------");
        for(int i = 0; i < n; i++){
            String s = buf.readLine();
            map.put(s, s);
        }     
        
        System.out.println("-----------------");
        for(HashMap.Entry<String, String> pair : map.entrySet()){
            System.out.println(pair.getKey());
        }
        
        
    }
    
}
