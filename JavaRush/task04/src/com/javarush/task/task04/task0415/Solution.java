/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task04.task0415;

/**
Правило треугольника
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
«Треугольник существует.» — если треугольник с такими сторонами существует.
«Треугольник не существует.» — если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше или равна сумме двух других, 
то треугольника с такими сторонами не существует.
 */
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a > (b + c)?"Треугольник не существует.": b > (a + c)?"Треугольник не существует.": c > (a + b)?"Треугольник не существует.":"Треугольник существует.");
        }
        
        
        
    }
}