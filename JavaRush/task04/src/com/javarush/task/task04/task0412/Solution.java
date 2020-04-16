/*
Положительное и отрицательное число
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
 */
package com.javarush.task.task04.task0412;

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
        if(sc.hasNextInt()){
            int x = sc.nextInt();
            if(x < 0){
                x += 1;
                System.out.println(x);
                return;
            }
            if(x == 0){
                System.out.println(x);
                return;
            }
            else{
                x *= 2;
                System.out.println(x);
                return;
            }
        }
        

    }

}