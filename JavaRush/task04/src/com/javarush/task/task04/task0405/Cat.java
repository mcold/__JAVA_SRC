package com.javarush.task.task04.task0405;

/*
 Реализовать метод setCatsCount
Реализовать метод setCatsCount так, чтобы с его помощью можно 
было устанавливать значение переменной catsCount равное переданному параметру.
 */

/**
 *
 * @author mcold
 */
public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {

    }
}
