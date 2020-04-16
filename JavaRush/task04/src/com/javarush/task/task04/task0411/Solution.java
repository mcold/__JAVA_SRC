/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task04.task0411;

/**
Времена года на Терре
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года 
* (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна
 */
public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //::CODE:
        switch(month){
            case 1: case 2: case 12:
                System.out.println("зима");
                break;
            case 3: case 4: case 5:
                System.out.println("осень");
                break;
            case 6: case 7: case 8:
                System.out.println("лето");
                break;
            default:
                System.out.println("осень");
                break;             
        }
        
        if(month == 12 || month < 3){
            System.out.println("зима");
        }
        if(month > 2 && month < 6){
            System.out.println("весна");
        }
        if(month > 5 && month < 9){
            System.out.println("лето");
        }
        else{
            System.out.println("осень");
        }
        
    }
}
