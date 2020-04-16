package com.javarush.task.task05.task0510;

/* 
Кошкоинициация

Создать класс Cat (кот) с пятью инициализаторами:
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
— вес, цвет, адрес (чужой домашний кот)

Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста.
А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat {
    //напишите тут ваш код
    private String name = null;
    private int age = 4;
    private double weight = 5;
    private String address = null;
    private String colour = "grey";
    
    public void initialize(String name){
        this.name = name;
    }
    
    public void initialize(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
    }
    
    public void initialize(double weight, String colour){
        this.weight = weight;
        this.colour = colour;
        
    }
    
    public void initialize(double weight, String colour, String address){
        this.weight = weight;
        this.colour = colour;
        this.address = address;
    }
    
    public static void main(String[] args) {

    }
}
