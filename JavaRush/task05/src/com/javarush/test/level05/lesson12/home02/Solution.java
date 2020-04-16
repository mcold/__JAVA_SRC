/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javarush.test.level05.lesson12.home02;

/**
/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution {
    
    public static void main(String[] args){
        Man m1 = new Man("Stanly", 15, "Los Angelos");
        Man m2 = new Man("Harry", 21, "New York");
        Woman w1 = new Woman("Elly", 18, "Saint-Petersburgh");
        Woman w2 = new Woman("Emily", 22, "Moscow");
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(w1);
        System.out.println(w2);
    }
    
    public static class Man{
        public String name;
        public int age;
        public String address;
        
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        
        @Override
        public String toString(){
            return (this.name + " " + this.age + " " + this.address);
        }
    }
    
    public static class Woman{
        public String name;
        public int age;
        public String address;
    
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        
        @Override
        public String toString(){
            return(this.name + " " + this.age + " " + this.address);
        }
    }
    
    
}
