package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Пример для чисел 1 2 2 4 5 -1:
2.8

Пример для чисел 4 3 2 1 -1:
2.5


*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split(" ");
        for(int i=0; i < parts.length; i++){
            if(Integer.valueOf(parts[i]) != -1){
                sum = sum + Integer.valueOf(parts[i]);
                n = n + 1;
            }
        }
        System.out.println(Double.valueOf(sum)/Double.valueOf(n));  
    }
    
      
}



