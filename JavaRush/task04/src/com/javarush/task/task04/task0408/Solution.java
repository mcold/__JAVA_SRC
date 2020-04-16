/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task04.task0408;

/* 
Реализовать метод compare(int a).
Метод должен выводить строку на экран «Число меньше 5«, если параметр метода меньше 5,
выводить строку «Число больше 5«, если параметр метода больше 5,
выводить строку «Число равно 5«, если параметр метода равен 5.


*/


public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //напишите тут ваш код
        System.out.println(a > 5 ? "Число больше 5": a < 5 ? "Число меньше 5" : "Число равно 5");

    }
}