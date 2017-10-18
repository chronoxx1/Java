package com.week4.poo.animal;

/**
 *
 * @author Pepe
 */

public class Lion extends noDomesticated{

    public Lion(String name, String color, int edad, boolean aggressive, String typeOfAnimal) {
        super(name, color, edad, aggressive, typeOfAnimal);
    }
    
    @Override
    public void eat(String meal){
        if (meal.equalsIgnoreCase("meat")) {
            System.out.println("I Prefer to eat a nigga but its Ok");
        }else{
            System.out.println("I going to eat you");
        }
    }
}
