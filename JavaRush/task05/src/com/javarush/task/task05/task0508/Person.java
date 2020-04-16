/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.task.task05.task0508;

/**
 *
 * @author mcold
 */
public class Person {
    //напишите тут ваш код
    private String name;
    private int age;
    private char sex;
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setSex(char sex){
        this.sex = sex;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public char getSex(){
        return this.sex;
    }

    public static void main(String[] args) {

    }
}

