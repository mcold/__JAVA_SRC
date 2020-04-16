/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task05.task0517;

/**
Конструируем котиков
Создать класс Cat (кот) с пятью конструкторами:
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет, (имя, адрес и возраст – неизвестные. Кот — бездомный)
— вес, цвет, адрес (чужой домашний кот)

Задача конструктора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 */
public class Cat {
    //напишите тут ваш код
    String name;
    double weight;
    int age;
    String colour;
    String addres;
    
    public Cat(String name){
        this.name = name;
    }
    
    public Cat(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    
    public Cat(String name, int age){
        this.name = name;
        this.weight = 10;
        this.age = age;
    }
    
    public Cat(double weight, String colour){
        this.weight = weight;
        this.colour = colour;
        this.addres = "Homeless";
    }
    
    public Cat(double weight, String colour, String address){
        this.weight = weight;
        this.colour = colour;
        this.addres = address;
    }
    
    public static void main(String[] args) {

    }
}

