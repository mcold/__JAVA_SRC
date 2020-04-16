package test;

public class Animal {
    
    int weight;
    int height;
    int age;
    String name;
    protected void setName(String name){
        this.name = name;
    }
    
    
    class Cat extends Animal{
        @Override
        public void setName(String love){
            this.name = love;
            //return this.name;
            //return this.name;
        }
    }
    
    
}


