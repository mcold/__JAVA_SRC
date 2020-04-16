package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
Создать класс Friend (друг) с тремя конструкторами:
— Имя
— Имя, возраст
— Имя, возраст, пол
*/

public class Friend {
    //напишите тут ваш код
    String Name;
    int age;
    char sex;
    
    public Friend(String name){
        this.Name = name;
        this.age = 1;
        this.sex = 'm';
    }
    
    public Friend(String name, int age){
        this.Name = name;
        this.age = age;
        this.sex = 'm';
    }
    
    public Friend(String name, int age, char sex){
        this.Name = name;
        this.age = age;
        this.sex = sex;
    }
    

    public static void main(String[] args) {

    }
}
