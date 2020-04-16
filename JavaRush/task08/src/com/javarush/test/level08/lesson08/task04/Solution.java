package com.javarush.test.level08.lesson08.task04;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Date;


public class Solution {
    
    public static HashMap<String, Date> createMap(){
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Kirin", new Date("FEBRUARY 1 1966"));
        map.put("Golin", new Date("JANUARY 1 1946"));
        map.put("Dimol", new Date("JULY 1 1976"));
        map.put("Rickir", new Date("AUGUST 1 1987"));
        map.put("Beer", new Date("JULY 1 1998"));
        map.put("Deer", new Date("SEPTEMBER 1 1989"));
        map.put("Meer", new Date("NOVEMBER 1 1996"));
        map.put("Puck", new Date("APRIL 1 1958"));
        map.put("Lookit", new Date("MAY 1 1978"));
        return map;
    }
    
    public static void removeAllSummerPeople(HashMap<String, Date> map){
        Iterator<Map.Entry<String, Date>> Iterator = map.entrySet().iterator();
        while(Iterator.hasNext()){
            Map.Entry<String, Date> pair = Iterator.next();
            Date month = pair.getValue();
            if(month.getMonth() == 5 || month.getMonth() == 6 || month.getMonth() == 7)
                Iterator.remove();
            
        }
    }
    
    
}
