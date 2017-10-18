package com.week4.poo.animal;

/**
 *
 * @author Pepe
 */

public class Cat extends Domesticated{

    public Cat(String name, String color, int edad, boolean agressive, String typeOfAnimal) {
        super(name, color, edad, agressive, typeOfAnimal);
    }

    public void meow(){
        System.out.println("Meeow Meeeoww Meow");
    }
    
    @Override
    public void eat(String meal){
        if (meal.equalsIgnoreCase("cats food")) {
            System.out.println("Yummi Meow rrrr");
        }else{
            System.out.println("Iuuuk Meeeeeeeeow");
        }
    }
    
    public void disturb(String name){
        if (name.equalsIgnoreCase("nermal")) {
            System.out.println("disturbing garfield.....");
        }else if(name.equalsIgnoreCase("garfield")){
            System.out.println("disturbing oddie.....");
        }else{
            System.out.println("I dont want to do that");
        }
    }
}
