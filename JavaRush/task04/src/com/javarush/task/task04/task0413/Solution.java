/*
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».
 */
package com.javarush.task.task04.task0413;

/**
 *
 * @author mcold
 */
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        while (true){
            if(sc.hasNext()){
                int x = sc.nextInt();
                switch (x){
                    case 1:
                        System.out.println("понедельник");
                        break;
                    case 2:
                        System.out.println("вторник");
                        break;
                    case 3:
                        System.out.println("среда");
                        break;
                    case 4:
                        System.out.println("четверг");
                        break;
                    case 5:
                        System.out.println("пятница");
                        break;
                    case 6:
                        System.out.println("суббота");
                        break;
                    case 7:
                        System.out.println("воскресенье");
                        break;
                    default:
                        System.out.println("такого дня недели не существует");
                        break;                    
                }
            }
        }
        
    }
}