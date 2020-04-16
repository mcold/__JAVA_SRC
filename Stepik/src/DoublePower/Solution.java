package DoublePower;

/**
 Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

Решать можно разными способами:

воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
применив пару трюков из двоичной арифметики;
написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 */

import java.lang.Integer;

public class Solution {
    
    public static void main(String[] args){
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));
        String s = 'A' + "2";
        System.out.println(s);
    }
    
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
    
}
