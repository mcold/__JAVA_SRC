package com.javarush.task.task04.task0404;

/*
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), 
количество котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.


Требования:
1. Класс Cat должен содержать только одну переменную catsCount.
2. Переменная catsCount должна быть статической, иметь модификатор доступа private, 
тип int и проинициализирована нулем.
3. Класс Cat должен содержать два метода addNewCat и main.
4. Метод addNewCat класса Cat должен увеличивать количество котов на 1.
 */

/**
 *
 * @author mcold
 */
public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        Cat.catsCount += 1;
    }
    
    public void addNewCat2() {
        //напишите тут ваш код
        Cat.catsCount += 1;
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        Cat.addNewCat();             // cause method have static modifier
        Cat c2 = new Cat();
        c2.addNewCat2();            // cause method don't have static modifier
        
        System.out.println(Cat.catsCount);
        
    }
}