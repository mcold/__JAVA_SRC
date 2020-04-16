package com.javarush.test.level08.lesson08.task03;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Solution {
    
   public static HashMap<String, String> createMap(){
       
        HashMap<String, String> map = new HashMap<>();
        map.put("Алибабай", "Олексей");
        map.put("Бабай", "Олексей");
        map.put("Бур", "Мария");
        map.put("Мур", "Мария");
        map.put("Алибабай", "Александр");
        map.put("Мур", "Александр");
        map.put("Кот", "Екатерина");
        map.put("Бур", "Игорь");
        map.put("Бурай", "Яна");
        map.put("Бабай", "Павел");
        return map;
       
   } 
   
   public static int getCountTheSameFirstName(HashMap<String, String> map, String name){
       int countName = 0;
       Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
       while(iterator.hasNext()){
           if(name.equals(iterator.next().getValue()))
               countName++;
       }
       return countName;
   }
   
   
   
   
   
   public static void main(String[] args){
       HashMap<String, String> map = createMap();
   }
    
}
