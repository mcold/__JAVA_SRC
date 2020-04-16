package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Date;
import java.text.SimpleDateFormat;

public class Solution {
    
    public static void main(String[] args){
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(dateFormat.format(d));
        
    }
}
