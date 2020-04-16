package Palindrom;

/*
Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов в строке не будет.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Подсказки (не читайте, если хотите решить сами):

для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением "[^a-zA-Z0-9]"; найдите в классе String метод, выполняющий замену по регулярному выражению;
для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(), который находится в классе StringBuilder;
в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
 */

import java.util.Arrays;

public class Solution {
    
    public static void main(String[] args){
        String s = "Madam, I'm Adam!";
        System.out.println(isPalindrome(s));
    }
    
    
    public static boolean isPalindrome(String text) {
        
        //String leftText = (text.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();
        StringBuilder leftText = new StringBuilder((text.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase());
        StringBuilder rightText = new StringBuilder(leftText).reverse();
        
        System.out.println(leftText);
        System.out.println(rightText);
        
        String left = String.valueOf(leftText);
        char[] l = left.toCharArray();
        
        String right = String.valueOf(rightText);
        char[] r = right.toCharArray();
        
//bool b = Arrays.equals(leftText, rightText);
        return Arrays.equals(l, r);
    }
}
