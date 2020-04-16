package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
— Имя
— Имя, рост
— Имя, рост, цвет
*/

public class Dog {
    //напишите тут ваш код
    String name = null;
    double height = 0;
    String colour = "grey";

    public void initialize(String name){
        this.name = name;
    }
    
    public void initialize(String name, double height){
        this.name = name;
        this.height = height;
    }
    
    public void initialize(String name, double height, String colour){
        this.name = name;
        this.height = height;
        this.colour = colour;
    }
    
    public static void main(String[] args) {

    }
}
