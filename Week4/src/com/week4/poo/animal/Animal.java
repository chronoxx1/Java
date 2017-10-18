package com.week4.poo.animal;

/**
 *
 * @author Pepe
 */

public class Animal {
    
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int edad) {
        this.name = name;
        this.color = color;
        this.age = edad;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    public void eat(String meal){
        System.out.println("Waiting for eat.....");
    }
    
    public void sleep(){
        System.out.println("Zzzzz Zzzzz...");
    }
}
